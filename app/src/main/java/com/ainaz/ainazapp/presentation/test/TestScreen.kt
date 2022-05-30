package com.ainaz.ainazapp.presentation.test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun TestScreen() {
    val viewModel: TestViewModel = hiltViewModel()
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        when (viewModel.uiState.value) {
            is TestState.Questions -> SurveyQuestionsScreen(
                questions = viewModel.uiState.value,
                onDonePressed = { viewModel.computeResult(viewModel.uiState.value) },
                onBackPressed = {
                }
            )

        }
    }
}
