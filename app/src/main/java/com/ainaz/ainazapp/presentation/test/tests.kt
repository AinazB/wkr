package com.ainaz.ainazapp.presentation.test

val survey by lazy {
    Test(
        "survey", listOf(
            Question(
                id = 1,
                questionText = "I _ a student.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "is",
                        "am",
                        "are",
                        "be"
                    )
                ),
                correctAnswer = "am"
            ),
            Question(
                id = 2,
                questionText = "He _ got two sisters.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "There is",
                        "He is",
                        "He got",
                        "He is got"
                    )
                ),
                correctAnswer = "He is got"
            ),
            Question(
                id = 3,
                questionText = "He _ like me.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "no",
                        "doesn't",
                        "don't",
                        "not"
                    )
                ),
                correctAnswer = "doesn't"
            ),
            Question(
                id = 4,
                questionText = "I'm English. Where are _ from?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "you",
                        "are you",
                        "are",
                        "you are"
                    )
                ),
                correctAnswer = "you"
            ),
            Question(
                id = 5,
                questionText = "_ she go to school every day?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "Do",
                        "Does",
                        "Is",
                        "Are"
                    )
                ),
                correctAnswer = "Does"
            ),
            Question(
                id = 6,
                questionText = "_ she go to school every day?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "Do",
                        "Does",
                        "Is",
                        "Are"
                    )
                ),
                correctAnswer = "Does"
            ),
            Question(
                id = 7,
                questionText = "There isn't _ cheese in the fridge.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "some",
                        "a",
                        "any",
                        "the"
                    )
                ),
                correctAnswer = "any"
            ),
            Question(
                id = 8,
                questionText = "_ you speak English?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "Are",
                        "Can",
                        "Were",
                        "Have"
                    )
                ),
                correctAnswer = "Are"
            ),
            Question(
                id = 9,
                questionText = "\"What are you doing now?\" \"I _ English.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "is",
                        "study",
                        "studying",
                        "am studying"
                    )
                ),
                correctAnswer = "am studying"
            ),
            Question(
                id = 10,
                questionText = "Do you like _ in London?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "lives",
                        "living",
                        "lived",
                        "live"
                    )
                ),
                correctAnswer = "living"
            ),
            Question(
                id = 11,
                questionText = "I _ to the cinema yesterday.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "go",
                        "gone",
                        "went",
                        "was"
                    )
                ),
                correctAnswer = "went"
            ),
            Question(
                id = 12,
                questionText = "James _ to play football tomorrow.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "go",
                        "gone",
                        "went",
                        "was"
                    )
                ),
                correctAnswer = "went"
            ),
        )
    )
}
