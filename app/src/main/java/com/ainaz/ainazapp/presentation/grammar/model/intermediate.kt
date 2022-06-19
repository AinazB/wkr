package com.ainaz.ainazapp.presentation.grammar.model

import com.ainaz.ainazapp.presentation.grammar.Content
import com.ainaz.ainazapp.presentation.grammar.Example
import com.ainaz.ainazapp.presentation.grammar.Expression
import com.ainaz.ainazapp.presentation.grammar.TopicDetail

val conditionals = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Условные предложения в английском языке"
        ),
        Content.SubtitleContent(
            "Придаточные обстоятельственные предложения делятся на предложения места, времени, образа действия, сравнения, причины, цели, следствия, уступки и условия. Из них нужно особо выделить условные предложения, потому что они тесно связаны с использованием сослагательного наклонения глагола и часто вызывают трудности."
        ),
        Content.TitleContent(
            "Типы условных предложений в английском языке"
        ),
        Content.SubtitleContent(
            "Первый тип обозначает реальные, осуществимые условия, которые могут относиться к настоящему или будущему. В таком случае в главном предложении(следствия) глагол используется в будущем времени, а в придаточном(условия) – в настоящем.Оба используются в изъявительном наклонении:"
        ),

        Content.ExamplesContent(
            listOf(
                Example(
                    "If you are late again, I will have to fire you.",
                    "Если ты опоздаешь еще раз, мне придется тебя уволить."
                ),
                Example(
                    "We will have a hike if the weather is fine .",
                    "Если погода будет хорошей, мы сходим в поход."
                )
            )
        ),
        Content.SubtitleContent(
            "Второй тип охватывает малореальные, неосуществимые условия, относящиеся к настоящему или будущему. В главном предложении (следствия) тогда используется вспомогательный глагол should / would и инфинитив глагола без частицы to, а в придаточном (условия) – прошедшая форма глагола to be в сослагательном наклонении( were во всех лицах) или форма Past Simple всех других глаголов :"
        ),


        Content.ExamplesContent(
            listOf(
                Example(
                    "If I were you I wouldn't poke my nose everywhere .",
                    " Я бы на вашем месте не совал всюду нос ."
                ),
                Example(
                    "If Australia did not happen to be isolated from the rest of the world, it wouldn 't possess such a unique fauna.",
                    "Если бы Австралия не оказалась изолирована от остального мира, у нее бы не было такой уникальной фауны."
                )
            )
        ),


        Content.SubtitleContent(
            "Третий тип описывает невыполненные условия в прошлом. В главном предложении (следствия) используется вспомогательный глагол should / would и глагол во времени Present Perfect, а в придаточном (условия) – глагол в форме Past Perfect :"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "If you had gone to bed in time you wouldn 't have overslept your interview.",
                    "Если бы ты вовремя пошла спать, то не проспала бы собеседование."
                ),
            )
        )
    )
)

val modal =
    TopicDetail(
        content = listOf(
            Content.TitleContent("Модальные глаголы"),
            Content.SubtitleContent("Модальные глаголы в английском языке отличаются от остальных глаголов тем, что они не используются самостоятельно и не обозначают конкретного действия или состояния, они отражают его модальность, то есть отношение к нему говорящего. Вместе модальный глагол и инфинитив значащего глагола образуют составное модальное сказуемое (compound modal predicate):"),

            Content.ExamplesContent(
                listOf(
                    Example("I can play volleyball.", "Я умею играть в волейбол."),
                )
            ),

            Content.SubtitleContent("О каком именно отношении идет речь? Например, говорящий может оценивать действие как возможное, необходимое, разрешаемое, просимое, запрещенное, приказываемое, маловероятное, очень вероятное и т. д.:"),
            Content.ExamplesContent(
                listOf(
                    Example("I will go to London.", "Я поеду в Лондон."),
                    Example("I can go to London.", "Я могу поехать в Лондон."),
                    Example("I have to go to London.", "Я должен поехать в Лондон."),
                    Example("Can I go to London?", "Можно я поеду в Лондон?"),
                )
            ),

            Content.SubtitleContent("О каком именно отношении идет речь? Например, говорящий может оценивать действие как возможное, необходимое, разрешаемое, просимое, запрещенное, приказываемое, маловероятное, очень вероятное и т. д.:"),

            Content.TitleContent("Модальные глаголы в английском языке:"),

            Content.SubtitleContent(
                "Модальные глаголы"
            ),

            Content.ExamplesContent(
                listOf(
                    Example("Can", "Could"),
                    Example("May", "Might"),
                    Example("Must", ""),
                    Example("Have to", "Have got to"),
                    Example("Be to", ""),
                    Example("Need", ""),
                    Example("Ought to", ""),
                    Example("Should", ""),
                    Example("Would", ""),
                    Example("Shall", ""),
                    Example("Will", ""),
                    Example("Dare", ""),
                    Example("Used to", ""),
                )
            ),
            Content.SubtitleContent(
                "Чаще всего используются первые три: Can, May и Must. Эти глаголы имеют самое общее значение и иногда могут заменять собой остальные модальные глаголы. Вопросительные предложения с модальными глаголами образуются без вспомогательного глагола todo, при этом модальный глагол выносится в начало предложения :"
            )
        )
    )
val usedTo = TopicDetail(
    content = listOf(
        Content.TitleContent("Модальный глагол Used to"),
        Content.SubtitleContent("Used to признается модальным глаголом не всеми, он занимает некое пограничное положение между модальными и полнозначными английскими глаголами. В отличие от всех остальных модальных глаголов, он используется только в форме прошедшего времени. Как следствие, когда он употребляется в комбинации с do для образования вопросов и отрицаний, вспомогательный глагол употребляется в прошедшем времени:"),

        Content.ExamplesContent(
            listOf(
                Example(
                    "Timmy did not use to be so gloom when I knew him.",
                    "Тимми не был таким мрачным, когда я знал его."
                ),
            )
        ),

        Content.SubtitleContent("Модальный глагол Used to используется для описания действия или состояния, регулярно имевшего место в прошлом:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Joanna used to give each of us a sandwich before she let us go to school.",
                    "Джоанна давала нам по сэндвичу перед тем, как отпустить в школу."
                ),
            )
        ),

        Content.SubtitleContent("Отрицательная форма глагола Used to может образовываться двумя способами:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "We did not use to think of telephone as a common thing when I was a child.",
                    "Когда я был ребенком, мы не относились к телефону, как к самой обычной вещи."
                ),
                Example(
                    "We used not to worry so much about money.",
                    "Раньше мы не пеклись так о деньгах."
                ),
            )
        ),
        Content.SubtitleContent("Аналогично образуются вопросы:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Did they use to visit you often?",
                    "Они часто тебя навещали?"
                ),
                Example(
                    "Well, Mary used to.",
                    "Ну, Мэри – часто."
                ),
                Example(
                    "Used he to play the guitar?",
                    "Он играл на гитаре?"
                ),
            )
        ),
    )
)

val haveTo = TopicDetail(
    listOf(
        Content.TitleContent("Модальный глагол Have to"),
        Content.SubtitleContent(
            "В отличие от остальных модальных глаголов Have to / have got to не являются недостаточными глаголами. Они, как и простые глаголы, способны отражать категории лица и числа. Опять же, в отличие от других модальных глаголов в английском языке, связанный с ними значащий глагол используется с частицей to. Для того, чтобы образовать вопросительную и отрицательную форму, нужно использовать вспомогательный глагол to do:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Do you really have to leave so early?",
                    "Тебе действительно нужно уйти так рано?"
                ),
                Example(
                    "You don't have to go with us if you don't want to.",
                    "Тебе не обязательно идти с нами, если тебе не хочется."
                ),
            )
        ),
        Content.TitleContent("Формы модального глагола Have to:"),
        Content.TableContent(
            listOf(
                Expression(
                    listOf("I have to (don't have to)", "We have to (don't have to)"),
                ),
                Expression(
                    listOf("You have to (don't have to)", "You have to (don't have to)"),
                ),
                Expression(
                    listOf("He/She/It has to (doesn't have to)", "They have to (don't have to)"),
                )
            )
        ),
        Content.TableContent(
            listOf(
                Expression(
                    listOf("I had to (did not have to)", "We had to (did not have to)"),
                ),
                Expression(
                    listOf("You had to (did not have to)", "You had to (did not have to)"),
                ),
                Expression(
                    listOf("He/She/It had to (did not have to)", "They had to (did not have to)"),
                )
            )
        ),
        Content.SubtitleContent("Разница между глаголами Have to и Have got to малоразличима, но, как правило, have to означает повторяющееся действие, а have got to – конкретное:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I have to visit my grandma every week.",
                    "Я должен навещать бабушку каждую неделю."
                ),
                Example(
                    "Have you got to visit your grandma tomorrow?",
                    "Тебе нужно завтра навестить бабушку?"
                )
            )
        ),
        Content.SubtitleContent("Глагол Have (got) to используется для выражения необходимости что-то сделать из-за определенных обстоятельств, то есть не из добровольного стремления:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Alex has to make many international phone calls.",
                    "Алексу приходится делать много международных звонков."
                ),
                Example(
                    "We were very short on time so we had to take taxi.",
                    "У нас было очень мало времени, поэтому мы были вынуждены взять такси."
                )
            )
        ),
        Content.SubtitleContent("Также Have to заменяет модальный глагол Must там, где тот не может использоваться – в прошедшем и будущем времени, а также при отрицаниях:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Yesterday I had to help my sister.",
                    "Вчера я должен был помочь сестре."
                ),
                Example(
                    "The road is blocked, the bus will have to go around.",
                    "Дорога перекрыта, автобусу придется ехать в объезд."
                ),
                Example(
                    "You don't have to work full time.",
                    "Вам не нужно работать полный рабочий день."
                ),
            )
        ),
    )
)

val intermediateTopics = listOf(
    conditionals, modal, usedTo, haveTo
)
