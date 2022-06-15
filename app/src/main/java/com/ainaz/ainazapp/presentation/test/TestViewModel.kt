package com.ainaz.ainazapp.presentation.test

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor() : ViewModel() {

    private var _uiState = mutableStateOf<TestState>(TestState.Questions())
    val uiState: State<TestState> = _uiState

    var correctCount = 0

    private lateinit var surveyInitialState: TestState

    init {
        getQuestions()
    }

    fun computeResult(surveyQuestions: TestState.Questions) {
        surveyQuestions.questionsState.map {
            if ((it.answer as Answer.SingleChoice).answer == it.correctAnswer) {
                correctCount++
            }
        }
        _uiState.value = (_uiState.value as TestState.Questions).copy(showResult = true)
        //_uiState.value = TestState.Result("")
    }

    fun getQuestions() {
        viewModelScope.launch {
            // Create the default questions state based on the survey questions
            val questions: List<QuestionState> = survey.questions.mapIndexed { index, question ->
                val showPrevious = index > 0
                val showDone = index == survey.questions.size - 1
                QuestionState(
                    question = question,
                    questionIndex = index,
                    correctAnswer = question.correctAnswer,
                    totalQuestionsCount = survey.questions.size,
                    showPrevious = showPrevious,
                    showDone = showDone
                )
            }
            _uiState.value = (uiState.value as TestState.Questions).copy(
                questionsState = questions,
                showResult = false
            )
        }
    }

}
