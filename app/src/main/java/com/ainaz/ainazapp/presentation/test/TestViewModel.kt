package com.ainaz.ainazapp.presentation.test

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor() : ViewModel() {

    private val _uiState = mutableStateOf(TestState.Questions())
    val uiState: State<TestState.Questions> = _uiState

    private lateinit var surveyInitialState: TestState

    init {
        viewModelScope.launch {
            val survey = Test(
                "survey", listOf(
                    Question(
                        1,
                        "I _ a student.",
                        PossibleAnswer.SingleChoice(
                            listOf(
                                "is",
                                "am",
                                "are",
                                "be"
                            )
                        )
                    ),
                    Question(
                        2,
                        "He _ got two sisters.",
                        PossibleAnswer.SingleChoice(
                            listOf(
                                "There is",
                                "He is",
                                "He got",
                                "He is got"
                            )
                        )
                    ),
                    Question(
                        3,
                        "mad?",
                        PossibleAnswer.SingleChoice(
                            listOf(
                                "a",
                                "b",
                                "c",
                                "d"
                            )
                        )
                    )
                )
            )

            // Create the default questions state based on the survey questions
            val questions: List<QuestionState> = survey.questions.mapIndexed { index, question ->
                val showPrevious = index > 0
                val showDone = index == survey.questions.size - 1
                QuestionState(
                    question = question,
                    questionIndex = index,
                    totalQuestionsCount = survey.questions.size,
                    showPrevious = showPrevious,
                    showDone = showDone
                )
            }
            surveyInitialState = TestState.Questions(survey.title, questions)
            _uiState.value = surveyInitialState as TestState.Questions
        }
    }

    fun computeResult(surveyQuestions: TestState.Questions) {
        val answers = surveyQuestions.questionsState.mapNotNull { it.answer }
    }

}
