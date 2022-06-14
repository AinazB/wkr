package com.ainaz.ainazapp.presentation.dictionary

import androidx.compose.material.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@Composable
fun WordInfoDialog(showState: MutableState<Boolean>) {

    if (showState.value) {
        AlertDialog(
            title = {
            },
            text = {
            },
            onDismissRequest = {
                showState.value = false
            },
            confirmButton = {

            },
            dismissButton = {

            })
    }
}

