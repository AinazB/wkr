package com.ainaz.ainazapp.presentation.learn.card

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun rememberTwyperController(): TwyperController {
    return remember { TwyperControllerImpl() }
}

interface TwyperController {
    var currentCardController: CardController?
    fun swipeRight()
    fun swipeLeft()
}

class TwyperControllerImpl : TwyperController {
    override var currentCardController: CardController? = null

    override fun swipeRight() {
        currentCardController?.swipeRight()
    }

    override fun swipeLeft() {
        currentCardController?.swipeLeft()
    }
}
