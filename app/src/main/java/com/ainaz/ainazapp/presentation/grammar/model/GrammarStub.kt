package com.ainaz.ainazapp.presentation.grammar.model

import com.ainaz.ainazapp.presentation.grammar.Content
import com.ainaz.ainazapp.presentation.grammar.Example
import com.ainaz.ainazapp.presentation.grammar.Expression
import com.ainaz.ainazapp.presentation.grammar.TopicDetail

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
            )
        )
    )
}


