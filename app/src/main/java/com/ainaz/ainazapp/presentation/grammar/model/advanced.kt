package com.ainaz.ainazapp.presentation.grammar.model

import com.ainaz.ainazapp.presentation.grammar.Content
import com.ainaz.ainazapp.presentation.grammar.Example
import com.ainaz.ainazapp.presentation.grammar.Expression
import com.ainaz.ainazapp.presentation.grammar.TopicDetail


val futurePerfect = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Future Perfect - будущее совершенное время"
        ),
        Content.SubtitleContent(
            "Время Future Perfect используется довольно редко, оно обозначает действие, которое закончится до определенного момента или начала другого действия в будущем или будет продолжать длиться после него."
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Next year we will have been married for 30 years.",
                    "В следующем году мы будем женаты уже 30 лет."
                ),
            )
        ),
        Content.TitleContent(
            "Образование Future Perfect"
        ),
        Content.SubtitleContent(
            "Утвердительные предложения: "
        ),
        Content.TableContent(
            listOf(
                Expression(listOf("I will have played", "We will have played")),
                Expression(listOf("You will have played", "You will have played")),
                Expression(listOf("He / she / it will have played", "They will have played"))
            )
        ),
        Content.SubtitleContent(
            "Вопросительные предложения: "
        ),
        Content.TableContent(
            listOf(
                Expression(listOf("Will I have played?", "Will we have played?")),
                Expression(listOf("Will you have played?", "Will you have played?")),
                Expression(listOf("Will he / she / it have played?", "Will they have played?"))
            )
        ),
        Content.SubtitleContent(
            "Отрицательные предложения: "
        ),
        Content.TableContent(
            listOf(
                Expression(listOf("I will not have played", "We will not have played")),
                Expression(listOf("You will not have played", "You will not have played")),
                Expression(
                    listOf(
                        "He / she / it will not have played",
                        "They will not have played"
                    )
                )
            )
        ),
        Content.SubtitleContent(
            "Время Future Perfect образуется при помощи вспомогательного глагола to have в будущем времени и причастия прошедшего времени значимого глагола, то есть его «третьей формы». To have в будущем времени имеет форму will have. Причастие второе, или причастие прошедшего времени (Participle II), можно получить, прибавив к начальной форме значимого глагола окончание -ed:"
        ),
        Content.ExamplesContent(
            listOf(
                Example("Examine", "Examined"),
                Example("Enjoy", "Enjoyed"),
                Example("Close", "Closed"),
            )
        ),
        Content.SubtitleContent(
            "Однако в английском языке есть достаточно большая группа неправильных глаголов, которые образуют форму прошедшего времени не по общим правилам и которые необходимо запомнить.  В вопросительном предложении вспомогательный глагол выносится на место перед подлежащим, а значимый глагол остается после него:"
        ),

        Content.ExamplesContent(
            listOf(
                Example(
                    "Will you have read all these books by the exam time?",
                    "Ты прочтешь все эти книги до начала экзаменов?"
                ),
            )
        ),

        Content.SubtitleContent(
            "В отрицательных предложениях за вспомогательным глаголом следует отрицательная частица not. При этом они могут быть сокращены до формы won't:"
        ),

        Content.ExamplesContent(
            listOf(
                Example(
                    "I guess, I won't have received your next letter before Christmas.",
                    "Думаю, я не получу твое следующее письмо раньше Рождества."
                ),
            )
        ),

        Content.SubtitleContent(
            "Случаи употребления Future Perfect. Действие, которое начнется и закончится до определенного момента в будущем:"
        ),

        Content.ExamplesContent(
            listOf(
                Example(
                    "You will have spent much efforts before you can run a marathon.",
                    "Ты потратишь много усилий, прежде чем сможешь пробежать марафон."
                ),
            )
        ),
    )
)


val sequenceOfTenses = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Согласование времен в английском языке"
        ),
        Content.SubtitleContent(
            "Характерная особенность английского языка заключается в так называемом согласовании времён: время глагола придаточного предложения зависит от времени главного предложения. Правило согласования времён представляет особую трудность, когда сказуемое главного предложения выражено глаголом в одной из форм прошедшего времени. В этом случае в придаточных предложениях не могут употребляться формы настоящего и будущего времени глаголов, хотя речь идёт о действиях, которые совершаются в настоящем или будут совершаться в будущем. Если глагол в главном предложении стоит в одном из прошедших времен, то и глагол придаточного предложения должен стоять в одном из прошедших времен. В таких случаях правило согласования времен допускает три основных варианта: Если действие в придаточном предложении происходит одновременно с действием в главном предложении, то нужно использовать Past Simple или Past Continuous:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "They told us, “We are going to the library”.",
                    "Они сказали нам : «Мы идем в библиотеку»."
                ),
            )
        ),
        Content.SubtitleContent(
            "Если действие в придаточном предложении предшествует действию в главном предложении, то глагол в придаточном используется в Past Perfect или Past Perfect Continuous:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "We were told, “It was raining a lot”.",
                    "Нам сказали: «Было много дождей»."
                ),
            )
        ),
        Content.SubtitleContent(
            "Если действие в придаточном предложении следует после действия в главном, то нужно использовать одно из времен Future-in the-Past:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "She said she would try to get the highest mark on the exam.",
                    "Она сказала, что постарается заработать на экзамене лучшую оценку."
                ),
            )
        ),
        Content.SubtitleContent(
            "Исключения: Время в придаточном предложении может остаться без изменения, если в нем указано точное время :"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "He told us he took part in the Moscow Olympic games in 1980.",
                    "Он рассказал нам, что в 1980 году принимал участие в Московских Олимпийских играх."
                ),
            )
        ),

        )
)


val coordinateSentences = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Сложносочиненные предложения в английском языке"
        ),
        Content.SubtitleContent(
            "Два или более простых предложений могут быть объединены в одно сложное, выражающее общую мысль. Сложные предложения делятся на сложносочиненные и сложноподчиненные ."
        ),
        Content.TitleContent(
            "Сложносочиненные предложения"
        ),
        Content.SubtitleContent(
            "Сложносочиненные предложения состоят из равноправных по значению простых предложений, которые не зависят одно от другого."
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I like the sports channel, but my wife prefers movies.",
                    "Мне нравится спортивный канал, но моя жена предпочитает фильмы."
                ),
                Example(
                    "We overslept and the train left without us. ",
                    "Мы проспали и поезд ушел без нас."
                ),

                Example(
                    "I saw hundreds of people on the streets, many of them looked familiar.",
                    "Я видел на улицах сотни людей, многие из них выглядели знакомо."
                ),
            )
        ),

        Content.SubtitleContent(
            "Простые предложения в составе сложносочиненного могут быть соединены без союза (в таком случае они часто пишутся через точку с запятой) или с помощью одного из следующих сочинительных союзов:"
        ),

        Content.ExamplesContent(
            listOf(
                Example("and", "и"),
                Example(
                    "as well as",
                    "а также"
                ),
                Example(
                    "neither ... nor", "ни ... ни"
                ),
                Example("but", "но, однако"),
                Example("not only ... but also", "не только ... но и"),
            )
        ),

        )
)


val complexSentences = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Сложноподчиненные предложения в английском языке"
        ),
        Content.SubtitleContent(
            "В сложноподчиненном предложении составляющие части неравноправны, одно из простых предложений поясняет другое. Второстепенное, зависимое предложение называется придаточным, а основное по смыслу – главным . Такие предложения обычно соединяются подчинительными союзами that,if, after, because, who, whose,when, where, но могут использоваться и без них :"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Nobody likes people who think they know everything.",
                    "Никто не любит людей, которые, по их мнению, всё знают."
                ),
                Example(
                    "I bought the book you had liked in the shop.",
                    "Я купил ту книгу, которая тебе приглянулась в магазине."
                ),
            )
        ),

        Content.SubtitleContent(
            "Придаточные предложения в составе сложноподчиненного могут заменять собой любой член предложения: подлежащее, сказуемое, точнее, его именную часть, прямое и косвенное дополнение, определение или обстоятельство:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Who will become the next president is still unclear.",
                    "По-прежнему неясно, кто станет следующим президентом."
                ),
                Example(
                    "This wine is not what we used to drink in Greece. ",
                    "Этому вину далеко до того, что мы пили в Греции."
                ),
                Example(
                    "Today our teacher told us how one writes a CV.",
                    "Сегодня учитель рассказал нам, как писать резюме."
                ),
                Example(
                    "A lens is a piece of glass which refracts light.",
                    "Линза – это кусок стекла, преломляющий свет."
                ),
            )
        ),
    )
)


val advancedTopics = listOf(
    futurePerfect,
    sequenceOfTenses,
    coordinateSentences,
    complexSentences
)
