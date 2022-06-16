package com.ainaz.ainazapp.presentation.test

val survey by lazy {
    Test(
        "survey", mutableListOf(
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
            Question(
                id = 13,
                questionText = "She liked the film _ ?",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "isn’t it",
                        "didn’t she",
                        "wont she",
                        "doesn’t she"
                    )
                ),
                correctAnswer = "didn’t she"
            ),

            Question(
                id = 14,
                questionText = "I worked hard _ my exam.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "to pass",
                        "for pass",
                        "for passing",
                        "to passing"
                    )
                ),
                correctAnswer = "to pass"
            ),

            Question(
                id = 15,
                questionText = "I When I arrived at the station the train _ .",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "had already left",
                        "already left",
                        "was already left",
                        "would already leave"
                    )
                ),
                correctAnswer = "had already left"
            ),

            Question(
                id = 16,
                questionText = "After _ his homework he went to bed.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "to finish",
                        "finish",
                        "finished",
                        "finishing"
                    )
                ),
                correctAnswer = "finishing"
            ),

            Question(
                id = 17,
                questionText = "I _ go to Spain next year.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "would like",
                        "like ",
                        "like to",
                        "would like to "
                    )
                ),
                correctAnswer = "would like to"
            ),

            Question(
                id = 18,
                questionText = "When he _ finished the exam, he'll be able to talk to you.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "will",
                        "will have",
                        "is",
                        "has"
                    )
                ),
                correctAnswer = "has"
            ),

            Question(
                id = 19,
                questionText = "If he _ the car immediately the accident wouldn't have happened.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "stopped",
                        "had stopped",
                        "would stop",
                        "would have stopped"
                    )
                ),
                correctAnswer = "had stopped"
            ),

            Question(
                id = 20,
                questionText = "If I had asked the way I _ got lost.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "wouldn’t have",
                        "hadn’t ",
                        "not have",
                        "won’t have"
                    )
                ),
                correctAnswer = "wouldn’t have"
            ),

            Question(
                id = 21,
                questionText = "You _ your homework before you came to the lesson!",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "should do",
                        "should have done ",
                        "should be done ",
                        "should be doing"
                    )
                ),
                correctAnswer = "should have done"
            ),

            Question(
                id = 22,
                questionText = "By next year he _ his exams.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "had passed",
                        "will pass",
                        "will have passed ",
                        "has passed"
                    )
                ),
                correctAnswer = "will have passed"
            ),

            Question(
                id = 23,
                questionText = "I've rung the bell but there's no answer. He _ in bed.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "must be",
                        "will be",
                        "can be",
                        "needs to be"
                    )
                ),
                correctAnswer = "must be"
            ),

            Question(
                id = 24,
                questionText = "I'm thinking _ away next Sunday.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "for going",
                        "to go",
                        "of going",
                        "I go"
                    )
                ),
                correctAnswer = "of going"
            ),

            Question(
                id = 25,
                questionText = "Would you mind _ me five dollars.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "to lend",
                        "lending",
                        "lent",
                        "going to lent"
                    )
                ),
                correctAnswer = "lending"
            ),

            Question(
                id = 26,
                questionText = "He didn't look when crossing the road. He _ in a hurry.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "must have been",
                        "had to be",
                        "might to be",
                        "should have been"
                    )
                ),
                correctAnswer = "must have been"
            ),

            Question(
                id = 27,
                questionText = " _ two tickets for the cinema.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "I’m given",
                        "They’re given",
                        "I’ve been given",
                        "I’ve given"
                    )
                ),
                correctAnswer = "I’ve given"
            ),

            Question(
                id = 28,
                questionText = " I've been sitting in the classroom _.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "for myself ",
                        "on my own",
                        "by myself ",
                        "only myself"
                    )
                ),
                correctAnswer = "on my own"
            ),

            Question(
                id = 29,
                questionText = " I'm looking forward _ you again.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "to see",
                        "to seeing",
                        "seeing ",
                        "of seeing"
                    )
                ),
                correctAnswer = "to see"
            ),

            Question(
                id = 30,
                questionText = "He _ eaten something before going to school.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "should",
                        "must",
                        "had to",
                        "ought to have"
                    )
                ),
                correctAnswer = "must"
            ),

            Question(
                id = 31,
                questionText = "If all the hotels are full you _ phone this number.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "would better",
                        "would rather",
                        "had rather",
                        "had better"
                    )
                ),
                correctAnswer = "would rather"
            ),

            Question(
                id = 32,
                questionText = "It's high time you _ some work!",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "would do",
                        "have done",
                        "do",
                        "did"
                    )
                ),
                correctAnswer = "did"
            ),

            Question(
                id = 33,
                questionText = "I wish I _ that.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "didn’t ",
                        "not say",
                        "hadn’t said",
                        "don’t say"
                    )
                ),
                correctAnswer = "hadn’t said"
            ),

            Question(
                id = 34,
                questionText = "Take that umbrella in case it _ .",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "has rain ",
                        "will rain",
                        "rain",
                        "do rain"
                    )
                ),
                correctAnswer = "will rain"
            ),

            Question(
                id = 35,
                questionText = "In spite of _ late she caught the bus.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "she was",
                        "she’s ",
                        "her",
                        "being"
                    )
                ),
                correctAnswer = "being"
            ),

            Question(
                id = 36,
                questionText = "Providing that _ hard she will pass the exam.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "she’ll study",
                        "she’ll be studying ",
                        "she’s studying",
                        "she studies"
                    )
                ),
                correctAnswer = "she’s studying"
            ),

            Question(
                id = 37,
                questionText = "He suffers _ hay fever every summer.",
                answer = PossibleAnswer.SingleChoice(
                    listOf(
                        "in",
                        "from",
                        "of",
                        "on"
                    )
                ),
                correctAnswer = "from"
            ),
        ).shuffled().subList(0, 25)
    )
}
