package com.ainaz.ainazapp.presentation.test

data class Test(
    val title: String,
    val questions: List<Question>
)

data class Question(
    val id: Int,
    val questionText: String,
    val answer: PossibleAnswer,
    val correctAnswer: String = "",
    val description: String? = null,
)

sealed class PossibleAnswer {
    data class SingleChoice(val optionsStringRes: List<String>) : PossibleAnswer()
    data class MultipleChoice(val optionsStringRes: List<String>) : PossibleAnswer()
}

sealed class Answer<T : PossibleAnswer> {
    data class SingleChoice(val answer: String) : Answer<PossibleAnswer.SingleChoice>()
    data class MultipleChoice(val answersStringRes: Set<String>) :
        Answer<PossibleAnswer.MultipleChoice>()
}

fun Answer.MultipleChoice.withAnswerSelected(
    answer: String,
    selected: Boolean
): Answer.MultipleChoice {
    val newStringRes = answersStringRes.toMutableSet()
    if (!selected) {
        newStringRes.remove(answer)
    } else {
        newStringRes.add(answer)
    }
    return Answer.MultipleChoice(newStringRes)
}
