package com.ainaz.ainazapp.presentation.grammar.model

import com.ainaz.ainazapp.presentation.grammar.Content
import com.ainaz.ainazapp.presentation.grammar.Example
import com.ainaz.ainazapp.presentation.grammar.Expression
import com.ainaz.ainazapp.presentation.grammar.TopicDetail
import com.ainaz.ainazapp.presentation.test.PossibleAnswer
import com.ainaz.ainazapp.presentation.test.Question
import com.ainaz.ainazapp.presentation.test.Test

val beginner = listOf(
    Topic(
        "Глагол to be",
        "Значение глагола to be - \"быть, находиться\". В отличие от других английских глаголов, глагол to be спрягается (т.е. изменяется по лицам и числам)."
    ),
    Topic(
        "Лицо и число английского глагола",
        "Английский глагол имеет два числа (единственное и множественное) и три лица – первое (я/мы), второе (ты/вы) и третье (он/она/оно/они)."
    ),
    Topic(
        "Местоимения в английском языке",
        "Местоимение – это часть речи, обозначающая, но не называющая прямо предметы, лица, их свойства и отношения или дающая их временную и пространственную характеристику."
    ),
    Topic(
        "Present Simple - простое настоящее время",
        "Время Present Simple обозначает действие в настоящем в широком смысле слова. Оно употребляется для обозначения обычных, регулярно повторяющихся или постоянных действий, например, когда мы говорим о чьих-либо привычках, режиме дня, расписании и т. д., т. е. Present Simple обозначает действия, которые происходят в настоящее время, но не привязаны именно к моменту речи."
    )
)

val intermediate = listOf(
    Topic(
        "Условные предложения первого и второго типов.",
        "Придаточные обстоятельственные предложения делятся на предложения места, времени, образа действия, сравнения, причины, цели, следствия, уступки и условия. Из них нужно особо выделить условные предложения, потому что они тесно связаны с использованием сослагательного наклонения глагола и часто вызывают трудности."
    ),
    Topic(
        "Модальные глаголы.",
        "Модальные глаголы в английском языке отличаются от остальных глаголов тем, что они не используются самостоятельно и не обозначают конкретного действия или состояния, они отражают его модальность, то есть отношение к нему говорящего. Вместе модальный глагол и инфинитив значащего глагола образуют составное модальное сказуемое (compound modal predicate)."
    ),
    Topic(
        "Конструкция used to/ didn’t use to, разница с would.",
        "Used to признается модальным глаголом не всеми, он занимает некое пограничное положение между модальными и полнозначными английскими глаголами. В отличие от всех остальных модальных глаголов, он используется только в форме прошедшего времени. Как следствие, когда он употребляется в комбинации с do для образования вопросов и отрицаний, вспомогательный глагол употребляется в прошедшем времени."
    ),
    Topic(
        "Модальный глагол Have to.",
        "В отличие от остальных модальных глаголов Have to / have got to не являются недостаточными глаголами. Они, как и простые глаголы, способны отражать категории лица и числа. Опять же, в отличие от других модальных глаголов в английском языке, связанный с ними значащий глагол используется с частицей to."
    )
)

val advanced = listOf(
    Topic(
        "Future Perfect Continuous.",
        "The future perfect continuous, also sometimes called the future perfect progressive, is a verb tense that describes actions that will continue up until a point in the future. The future perfect continuous consists of will + have + been + the verb's present participle (verb root + -ing)."
    ),
    Topic(
        "Ellipsis.",
        "n grammar and rhetoric, an ellipsis is the omission of one or more words, which must be supplied by the listener or reader for the sentence to be understood."
    ),
    Topic(
        "Cleft sentences.",
        "Cleft sentences are used to help us focus on a particular part of the sentence and to emphasise what we want to say by introducing it or building up to it with a kind of relative clause. Because there are two parts to the sentence it is called cleft (from the verb cleave) which means divided into two."
    ),
    Topic(
        "Punctuation.",
        "Used to признается модальным глаголом не всеми, он занимает некое пограничное положение между модальными и полнозначными английскими глаголами. В отличие от всех остальных модальных глаголов, он используется только в форме прошедшего времени. Как следствие, когда он употребляется в комбинации с do для образования вопросов и отрицаний, вспомогательный глагол употребляется в прошедшем времени."
    )

)

val topicDetailStub by lazy {
    TopicDetail(
        content = listOf(
            Content.TitleContent("Present Simple - простое настоящее время"),
            Content.SubtitleContent("Время Present Simple обозначает действие в настоящем в широком смысле слова. Оно употребляется для обозначения обычных, регулярно повторяющихся или постоянных действий, например, когда мы говорим о чьих-либо привычках, режиме дня, расписании и т. д., т. е. Present Simple обозначает действия, которые происходят в настоящее время, но не привязаны именно к моменту речи."),
            Content.ExamplesContent(
                listOf(
                    Example("I live in London.", "Я живу в Лондоне"),
                    Example(
                        "The meeting starts at 6 o'clock.",
                        "Собрание начинается в шесть часов."
                    )
                )
            ),
            Content.TitleContent("Образование Present Simple"),
            Content.SubtitleContent("Утвердительные предложения:"),
            Content.TableContent(
                listOf(
                    Expression(listOf("I play", "We play")),
                    Expression(listOf("You play", "You play")),
                    Expression(listOf("He / she / it plays", "They play"))
                )
            ),
            Content.SubtitleContent("Вопросительные предложения:"),
            Content.TableContent(
                listOf(
                    Expression(listOf("Do I play?", "Do we play?")),
                    Expression(listOf("Do you play?", "Do you play?")),
                    Expression(listOf("Does he / she / it play?", "Do they play?"))
                )
            ),
            Content.SubtitleContent("Отрицательные предложения:"),
            Content.TableContent(
                listOf(
                    Expression(listOf("Do I play?", "Do we play?")),
                    Expression(listOf("Do you play?", "Do you play?")),
                    Expression(listOf("Does he / she / it play?", "Do they play?"))
                )
            ),
            Content.TestContent(
                Test(
                    "", listOf(
                        Question(
                            id = 1,
                            questionText = "I _ Spanish with my sister.",
                            PossibleAnswer.SingleChoice(
                                listOf(
                                    "study",
                                    "studies"
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}


