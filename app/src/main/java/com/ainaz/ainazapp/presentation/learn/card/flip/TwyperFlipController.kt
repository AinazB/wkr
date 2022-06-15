package com.ainaz.ainazapp.presentation.learn.card

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ainaz.ainazapp.presentation.learn.card.flip.FlipCardController

@Composable
fun rememberTwyperFlipController(): TwyperFlipController {
    return remember { TwyperFlipControllerImpl() }
}

interface TwyperFlipController {
    var currentCardController: FlipCardController?
    fun swipeRight()
    fun swipeLeft()
    fun flip()
}

class TwyperFlipControllerImpl : TwyperFlipController {
    override var currentCardController: FlipCardController? = null

    override fun swipeRight() {
        currentCardController?.swipeRight()
    }

    override fun swipeLeft() {
        currentCardController?.swipeLeft()
    }

    override fun flip() {
        currentCardController?.setCardFlipState()
    }
}
