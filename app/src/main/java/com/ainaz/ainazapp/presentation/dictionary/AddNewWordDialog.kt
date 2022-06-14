package com.ainaz.ainazapp.presentation.dictionary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun AddNewWordDialog(
    showState: MutableState<Boolean>,
    onSaveClicked: (String, String, String) -> Unit
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }
    var wordInputState by remember { mutableStateOf("") }
    var translateInputState by remember { mutableStateOf("") }
    var mnemoInputState by remember { mutableStateOf("") }

    if (showState.value) {
        AlertDialog(
            title = {
            },
            text = {
                Column {
                    OutlinedTextField(
                        modifier = Modifier.focusRequester(focusRequester),
                        value = wordInputState,
                        label = { Text(text = "Введите слово") },
                        onValueChange = { wordInputState = it }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = translateInputState,
                        label = { Text(text = "Введите перевод") },
                        onValueChange = { translateInputState = it })
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = mnemoInputState,
                        label = { Text(text = "Введите заметку") },
                        onValueChange = { mnemoInputState = it })
                }
            },
            onDismissRequest = {
                showState.value = false
            },
            confirmButton = {
                OutlinedButton(onClick = {
                    onSaveClicked(
                        wordInputState,
                        translateInputState,
                        mnemoInputState
                    )
                    showState.value = false
                }, modifier = Modifier.padding(16.dp)) {
                    Text(text = "Сохранить", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
            })
    }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
        keyboardController?.show()
    }
}
