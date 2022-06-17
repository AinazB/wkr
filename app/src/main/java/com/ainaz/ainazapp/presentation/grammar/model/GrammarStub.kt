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

val presentSimple =
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
                            questionText = "James _ to play football tomorrow.",
                            correctAnswer = "went",
                            answer = PossibleAnswer.SingleChoice(
                                listOf(
                                    "go",
                                    "gone",
                                    "went",
                                    "was",
                                )
                            )
                        ),
                        Question(
                            id = 2,
                            questionText = "It's high time you _ some work!",
                            correctAnswer = "did''",
                            answer = PossibleAnswer.SingleChoice(
                                listOf(
                                    "would do",
                                    "have done",
                                    "do",
                                    "did",
                                )
                            )
                        )
                    )
                )
            )
        )
    )

val verbToBe = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Глагол to be в английском языке"
        ),
        Content.SubtitleContent(
            "Значение глагола to be - \"быть, находиться\". В отличие от других английских глаголов, глагол to be спрягается (т.е. изменяется по лицам и числам)."
        ),
        Content.TitleContent(
            "Формы глагола to be"
        ),
        Content.TableContent(
            listOf(
                Expression(listOf("I am", "я есть")),
                Expression(listOf("He / She / It is", "он, она, оно есть")),
                Expression(listOf("We are", "мы есть")),
                Expression(listOf("You are", "ты, вы есть")),
                Expression(listOf("Тhey are", "они есть"))
            )
        ),
        Content.ExamplesContent(
            listOf(
                Example("I am in the room.", "Я нахожусь в комнате."),
                Example(
                    "The book is on the table.",
                    "Книга лежит на столе."
                )
            )
        ),
    )
)


val pronoun = TopicDetail(
    content = listOf(
        Content.TitleContent(
            "Лицо и число английского глагола"
        ),
        Content.SubtitleContent(
            "Английский глагол имеет два числа (единственное и множественное) и три лица – первое (я/мы), второе (ты/вы) и третье (он/она/оно/они). Тем не менее, глагол может их выражать только в определенных случаях.Например,3 - е лицо единственного числа настоящего времени можно определить по окончанию -s(-es):"
        ),

        Content.ExamplesContent(
            listOf(
                Example("I play golf.", "Я играю в гольф."),
                Example(
                    "He plays basketball.",
                    "Он играет в баскетбол."
                )
            )
        ),

        Content.SubtitleContent(
            "Исключениями из этого правила являются: Модальные глаголы, к которым нельзя прибавлять окончание - s / -es:"
        ),
        Content.ExamplesContent(
            listOf(
                Example("He can swim faster.", "Он может плавать быстрее."),

                )
        ),
        Content.SubtitleContent(
            "Глагол to have, который в 3 лице ед. ч. имеет форму has:"
        ),
        Content.ExamplesContent(
            listOf(
                Example("He has many medals.", "У него много медалей."),

                )
        ),
        Content.TitleContent(
            "Формы глагола to have"
        ),
        Content.TableContent(
            listOf(
                Expression(listOf("I am", "We are")),
                Expression(listOf("You are", "You are")),
                Expression(listOf("He / she / it is", "They are"))
            )
        ),
        Content.SubtitleContent(
            "Кроме этого, глагол to be в прошедшем времени имеет форму was для единственного числа и were для множественного числа."
        ),
        Content.SubtitleContent(
            "Современному человеку может показаться странным, почему глагол to be имеет так много непохожих друг на друга форм. Дело в том, что в древнеанглийском языке они, в сущности, принадлежали трем разным глаголам, sind, beon и wesan, которые постепенно слились в один."
        )
    )
)

val pron =
    TopicDetail(
        content = listOf(
            Content.TitleContent("Местоимения в английском языке"),
            Content.SubtitleContent("Местоимение – это часть речи, обозначающая, но не называющая прямо предметы, лица, их свойства и отношения или дающая их временную и пространственную характеристику. По своему значению местоимения в английском языке делятся на несколько групп. Ниже приведен список этих групп и соответствующих им английских местоимений."),
            Content.SubtitleContent(
                "Личные местоимения:"
            ),

            Content.ExamplesContent(
                listOf(
                    Example("I", "Я"),
                    Example(
                        "You",
                        "Ты, Вы"
                    ),
                    Example("He", "Он"),
                    Example("She", "Она"),
                    Example("It", "Неодушевленные предметы, животные"),
                    Example("We", "Мы"),

                    Example("They", "Они"),
                    Example("Me", "Мне"),
                    Example("Him", "Его"),
                    Example("Her", "Ее"),
                    Example("Us", "Нам"),
                    Example("Them", "Их"),

                    )
            ),
            Content.SubtitleContent(
                "Притяжательные местоимения:"
            ),

            Content.ExamplesContent(
                listOf(
                    Example("My", "Мой"),
                    Example(
                        "Yours",
                        "Твой, Ваш"
                    ),
                    Example("His", "Его"),
                    Example("Her", "Ее"),
                    Example("Its", "Неодушевленных предметов, животных"),
                    Example("Our", "Наш"),

                    Example("Their", "Их"),
                    Example("Mine", "Мой"),
                    Example("Yours", "Твой, Ваш"),
                    Example("Hers", "Ее"),
                    Example("Ours", "Наш"),
                    Example("Theirs", "Их"),

                    )
            ),

            Content.SubtitleContent(
                "Указательные местоимения:"
            ),
            Content.ExamplesContent(
                listOf(
                    Example("This", "Этот"),
                    Example(
                        "That",
                        "Тот"
                    ),
                    Example(
                        "These", "Эти"
                    ),
                    Example("Those", "Те"),
                    Example("Such", "Такой"),


                    )
            ),
            Content.SubtitleContent(
                "Возвратные местоимения:"
            ),

            Content.ExamplesContent(
                listOf(
                    Example("Myself", "Сам, себя"),
                    Example(
                        "Yourself",
                        "Ты сам, себя"
                    ),
                    Example(
                        "Himself", "Он сам, себя"
                    ),
                    Example("Herself", "Она сама, себя"),
                    Example("Itself", "Неодушевленных предметы, животные себе"),
                    Example("Ourselves", "Мы сами, себя"),


                    Example("Yourselves", "Вы сами, себя"),

                    Example("Themselves", "Они сами, себя"),

                    )
            ),

            Content.SubtitleContent(
                "Вопросительные местоимения:"
            ),

            Content.ExamplesContent(
                listOf(
                    Example("Who", "Кто"),
                    Example(
                        "What",
                        "Что"
                    ),
                    Example(
                        "Which", "Который"
                    ),
                    Example("Whose", "Чьи"),
                    Example("Whoever", "Кто бы ни"),
                    Example("Whatever", "Что бы ни"),

                    Example("Whichever", "Какой угодно"),
                )
            ),
            Content.TitleContent("Употребление английских местоимений"),
            Content.SubtitleContent("Местоимение можно употребить вместо упомянутого существительного, что поможет избежать излишнего повторения"),

            Content.ExamplesContent(
                listOf(
                    Example(
                        "Old Jones surprised us again. He has helped to arrest a robber.",
                        " Старик Джонс опять нас удивил . Он помог задержать грабителя."
                    ),

                    )
            ),

            Content.SubtitleContent("Также они употребляются, когда лица и предметы, о котрых идет речь уже известны слушающему. "),

            Content.ExamplesContent(
                listOf(
                    Example(
                        "We have not seen this film, have we?",
                        "Мы не видели этот фильм, не так ли?"
                    )
                )
            ),
        )
    )


val beginnerTopics = listOf(
    verbToBe,
    pronoun,
    pron,
    presentSimple
)


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

val intermediateTopics = listOf(
    conditionals, modal
)



