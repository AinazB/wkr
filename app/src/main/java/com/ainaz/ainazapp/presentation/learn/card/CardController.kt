package com.ainaz.ainazapp.presentation.learn.card

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.lang.Math.abs

interface CardController {
    val cardX: Float
    val cardY: Float
    val rotation: Float
    var swipedOutDirection: SwipedOutDirection?

    fun onDrag(dragAmount: Offset)
    fun onDragCancel()
    fun onDragEnd()

    fun isCardOut(): Boolean
    fun swipeRight()
    fun swipeLeft()
}


@Composable
fun rememberCardController(): CardController {
    val scope = rememberCoroutineScope()
    val screenWidth =
        with(LocalDensity.current) { LocalConfiguration.current.screenWidthDp.dp.toPx() }
    return remember {
        val swipeX = Animatable(0f)
        val swipeY = Animatable(0f)
        CardControllerImpl(swipeX, swipeY, scope, screenWidth)
    }
}

open class CardControllerImpl(
    private val swipeX: Animatable<Float, AnimationVector1D>,
    private val swipeY: Animatable<Float, AnimationVector1D>,
    private val scope: CoroutineScope,
    private val screenWidth: Float,
) : CardController {
    companion object {
        private const val SWIPE_DURATION_IN_MILLIS = 450
    }

    override val cardX: Float
        get() = swipeX.value

    override val cardY: Float
        get() = swipeY.value

    override val rotation: Float
        get() = (swipeX.value / 60).coerceIn(-40f, 40f)
    override var swipedOutDirection: SwipedOutDirection? = null

    override fun onDrag(dragAmount: Offset) {
        scope.apply {
            launch { swipeX.animateTo(swipeX.targetValue + dragAmount.x) }
            launch { swipeY.animateTo(swipeY.targetValue + dragAmount.y) }
        }
    }

    override fun onDragCancel() {
        scope.apply {
            launch { swipeX.animateTo(0f) }
            launch { swipeY.animateTo(0f) }
        }
    }

    override fun onDragEnd() {
        val isSwipedOneThird = abs(swipeX.targetValue) > abs(screenWidth) / 3
        if (isSwipedOneThird) {
            if (swipeX.targetValue > 0) {
                swipeRight()
            } else {
                swipeLeft()
            }
        } else {
            onDragCancel()
        }
    }

    override fun isCardOut(): Boolean {
        return abs(swipeX.value) == screenWidth
    }

    override fun swipeRight() {
        scope.launch {
            swipedOutDirection = SwipedOutDirection.RIGHT
            swipeX.animateTo(screenWidth, tween(SWIPE_DURATION_IN_MILLIS))
        }
    }

    override fun swipeLeft() {
        scope.launch {
            swipedOutDirection = SwipedOutDirection.LEFT
            swipeX.animateTo(-screenWidth, tween(SWIPE_DURATION_IN_MILLIS))
        }
    }
}
