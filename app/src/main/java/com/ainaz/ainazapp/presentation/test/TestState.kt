package com.ainaz.ainazapp.presentation.test

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class QuestionState(
    val question: Question,
    val questionIndex: Int,
    val totalQuestionsCount: Int,
    val showPrevious: Boolean,
    val showDone: Boolean
) {
    var enableNext by mutableStateOf(false)
    var answer by mutableStateOf<Answer<*>?>(null)
}

sealed class TestState {
    data class Questions(
        val surveyTitle: String = "",
        val questionsState: List<QuestionState> = emptyList()
    ) : TestState() {
        var currentQuestionIndex by mutableStateOf(0)
    }

    data class Result(
        val surveyTitle: String
    ) : TestState()
}
