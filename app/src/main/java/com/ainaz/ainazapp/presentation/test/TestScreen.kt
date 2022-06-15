package com.ainaz.ainazapp.presentation.test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ainaz.ainazapp.presentation.navigation.NavScreen

@Composable
fun TestScreen(navController: NavController) {
    val viewModel: TestViewModel = hiltViewModel()
    val showResult = remember {
        mutableStateOf(false)
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        when (viewModel.uiState.value) {
            is TestState.Questions -> {
                val state = viewModel.uiState.value as TestState.Questions
                SurveyQuestionsScreen(
                    questions = state,
                    onDonePressed = { viewModel.computeResult(state) },
                    onBackPressed = {
                    }
                )
                if (state.showResult) {
                    showResult.value = true
                    ShowResult(
                        showState = showResult,
                        resultText = viewModel.correctCount,
                        onRepeatClicked = { viewModel.getQuestions() },
                        onGrammarClicked = { navController.navigate(NavScreen.GrammarScreen.route) }
                    )
                    viewModel.correctCount = 0
                }
            }
            is TestState.Result -> {

            }
        }
    }
}


@Composable
fun ShowResult(
    showState: MutableState<Boolean>,
    resultText: Int,
    onRepeatClicked: () -> Unit,
    onGrammarClicked: () -> Unit
) {
    if (showState.value) {
        AlertDialog(
            title = {
            },
            text = {
                Text(text = "Ваш результат $resultText")
            },
            onDismissRequest = {
                showState.value = false
            },
            confirmButton = {
                OutlinedButton(onClick = {
                    showState.value = false
                    onGrammarClicked()
                }, modifier = Modifier.padding(16.dp)) {
                    Text(text = "Учиться", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
//                OutlinedButton(onClick = {
//                    showState.value = false
//                    onRepeatClicked()
//                }, modifier = Modifier.padding(16.dp)) {
//                    Text(text = "Повторить", fontWeight = FontWeight.Bold)
//                }
            })
    }
}
