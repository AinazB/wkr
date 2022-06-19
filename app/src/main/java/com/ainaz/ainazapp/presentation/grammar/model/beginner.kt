package com.ainaz.ainazapp.presentation.grammar.model

import com.ainaz.ainazapp.presentation.grammar.Content
import com.ainaz.ainazapp.presentation.grammar.Example
import com.ainaz.ainazapp.presentation.grammar.Expression
import com.ainaz.ainazapp.presentation.grammar.TopicDetail
import com.ainaz.ainazapp.presentation.test.PossibleAnswer
import com.ainaz.ainazapp.presentation.test.Question
import com.ainaz.ainazapp.presentation.test.Test


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
        Content.SubtitleContent(
            "В данных примерах глагол to be является самостоятельным глаголом. Так же, как и в русском языке, глагол to be может быть глаголом-связкой в именном сказуемом (в значении \"есть\"). В отличие от русского языка, в английском языке глагол-связка никогда не опускается, поскольку английское предложение имеет строго фиксированный порядок слов: подлежащее (subject) + сказуемое (verb) + дополнение (object)"
        ),
        Content.ExamplesContent(
            listOf(
                Example("I am a doctor.", "Я врач. (Я есть врач.)"),
                Example(
                    "The weather is bad.",
                    "Погода плохая."
                ),
                Example(
                    "They are from Paris.",
                    "Они из Парижа."
                )
            )
        ),
        Content.SubtitleContent(
            "Глагол to be не требует вспомогательного глагола для образования вопросительной или отрицательной формы. Чтобы задать вопрос нужно поставить глагол to be перед подлежащим:"
        ),
        Content.ExamplesContent(
            listOf(
                Example("Am I happy?", "Я счастлив?"),
                Example(
                    "Is the book interesting?",
                    "Книга интересная?"
                ),
                Example(
                    "Is he our teacher?",
                    "Он наш учитель?"
                )
            )
        ),
        Content.TestContent(
            Test(
                "", listOf(
                    Question(
                        id = 1,
                        questionText = "Betty _ at home.",
                        correctAnswer = "is",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "is",
                                "are",
                                "am"
                            )
                        )
                    ),
                    Question(
                        id = 2,
                        questionText = "Mark and Ann _ students.",
                        correctAnswer = "are",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "is",
                                "are",
                                "am"
                            )
                        )
                    ),
                    Question(
                        id = 3,
                        questionText = "We _ interested in music.",
                        correctAnswer = "are",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "is",
                                "are",
                                "am"
                            )
                        )
                    )
                )
            )
        )
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
        ),
        Content.TestContent(
            Test(
                "", listOf(
                    Question(
                        id = 1,
                        questionText = "I don’t know where ... workbook is! Have you seen it?",
                        correctAnswer = "my",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "mine",
                                "me",
                                "my"
                            )
                        )
                    ),
                    Question(
                        id = 2,
                        questionText = "Why not consult Vicky and ask ... for a useful tip?",
                        correctAnswer = "her",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "she",
                                "her",
                                "hers"
                            )
                        )
                    ),
                    Question(
                        id = 3,
                        questionText = "Jeremy was a good friend of ... .",
                        correctAnswer = "mine",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "my",
                                "mine",
                                "me"
                            )
                        )
                    )
                )
            )
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
            Content.TestContent(
                Test(
                    "", listOf(
                        Question(
                            id = 1,
                            questionText = "I don’t know where ... workbook is! Have you seen it?",
                            correctAnswer = "my",
                            answer = PossibleAnswer.SingleChoice(
                                listOf(
                                    "mine",
                                    "me",
                                    "my"
                                )
                            )
                        ),
                        Question(
                            id = 2,
                            questionText = "Why not consult Vicky and ask ... for a useful tip?",
                            correctAnswer = "her",
                            answer = PossibleAnswer.SingleChoice(
                                listOf(
                                    "she",
                                    "her",
                                    "hers"
                                )
                            )
                        ),
                        Question(
                            id = 3,
                            questionText = "Jeremy was a good friend of ... .",
                            correctAnswer = "mine",
                            answer = PossibleAnswer.SingleChoice(
                                listOf(
                                    "my",
                                    "mine",
                                    "me"
                                )
                            )
                        )
                    )
                )
            )
        )
    )

val placeAdverb = TopicDetail(
    content = listOf(
        Content.TitleContent("Наречия места в английском языке"),
        Content.SubtitleContent("К наречиям места в английском языке относятся:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "here – здесь, тут"
                ),
                Example(
                    "there – там"
                ),
                Example(
                    "there – там"
                ),
                Example(
                    "inside – внутри"
                ),
                Example(
                    "outside – снаружи, извне"
                ),
                Example(
                    "above – наверху, вверху"
                ),
                Example(
                    "below – внизу, ниже"
                ),
                Example(
                    "somewhere – где-то, куда-нибудь"
                ),
                Example(
                    "anywhere – везде, где угодно"
                ),
                Example(
                    "nowhere – нигде, никуда"
                ),
                Example(
                    "elsewhere – где-то в другом месте"
                ),

                )
        ),
        Content.SubtitleContent("К наречиям места в английском языке относятся:"),
        Content.ExamplesContent(
            listOf(
                Example("The children are playing outside.", "Дети играют снаружи."),
                Example("Come here please.", "Дети играют снаружи."),
                Example(
                    "The expedition is moving eastward at the moment.",
                    "В данный момент экспедиция движется на восток."
                ),
            )
        ),
        Content.SubtitleContent(
            "Наречия somewhere и anywhere оба переводятся как «где-то, где-нибудь». Но их использование зависит от типа соответствующего предложения. Somewhere употребляется в утвердительных предложениях:",
        ),
        Content.ExamplesContent(
            listOf(
                Example("I've lost my keys somewhere.", "Я где-то потерял свои ключи."),
            )
        ),
        Content.SubtitleContent(
            "Anywhere – в вопросительных и отрицательных:",
        ),
        Content.ExamplesContent(
            listOf(
                Example("Did you see Johnny anywhere?", "Ты где-нибудь видела Джонни?"),
                Example(
                    "It's so cold outside I did not go anywhere.",
                    "На улице так холодно, что я никуда не ходил."
                ),
            )
        ),
    )
)

val prepOfTime = TopicDetail(
    listOf(
        Content.TitleContent("Общее правило для предлогов времени"),
        Content.SubtitleContent("Почему мы рассматриваем именно эти три предлога вместе? Дело в том, что когда мы их употребляем, то на русский язык все они переводятся одинаково – «в». Отсюда и путаница, ведь по-русски «в пятницу» – это on Friday, «в 1999 году» – in 1999, «в 8 утра» – at 8 a.m. Давайте сначала посмотрим на общую таблицу с правилом для трех предлогов, а потом будем разбираться с каждым предлогом отдельно."),
        Content.TitleContent("Предлог at в английском языке"),
        Content.SubtitleContent(
            "А вот несколько правил употребления предлога at: С конкретными моментами времени: at 6 o’clock (в 6 часов), at midday (в полдень), at midnight (в полночь), at the moment (сейчас)."
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I heard a strange noise at midnight.",
                    "В полночь я услышала странный звук."
                )
            )
        ),
        Content.SubtitleContent(
            "Однако стоит обратить внимание на то, что в некоторых случаях мы все же используем предлог in, говоря о ночи:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I woke up in the middle of the night when I heard my dog barking.",
                    "Я проснулась среди ночи, когда услышала, как лает моя собака."
                )
            )
        ),
        Content.SubtitleContent(
            "Когда речь идет о какой-либо определенной ночи."
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I had a fever in the night and had to take medicine.",
                    "Ночью у меня была температура, и мне пришлось принять лекарство. (здесь мы говорим о конкретной ночи, а не о времени суток в целом)"
                )
            )
        ),
        Content.TitleContent("Предлог at в английском языке"),
        Content.SubtitleContent("Приведем список случаев, когда используется предлог in: C длительными периодами времени. Например: времена года (in winter – зимой), месяцы (in October – в октябре), года (in 1967 – в 1967), десятилетия (in the 1990s – в 1990х), столетия (in the 18th century – в 18 веке) и другие периоды времени (in the week before Christmas – в течение недели перед Рождеством)."),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I was born in May.",
                    "Я родилась в мае."
                ),
                Example(
                    "She was in Italy in 1997. ",
                    "Она была в Италии в 1997."
                ),
            )
        ),
        Content.TitleContent("Предлог on в английском языке"),
        Content.SubtitleContent("И последний в списке, но не последний по значимости, предлог on."),
        Content.ExamplesContent(
            listOf(
                Example(
                    "My next lesson is on Friday. ",
                    "Мой следующий урок в пятницу."
                ),
                Example(
                    "My birthday is on the 16th of May. ",
                    "Мой день рождения 16-го мая."
                ),
                Example(
                    "I am meeting my friends on Friday evening.",
                    "Я встречаюсь с друзьями в пятницу вечером."
                ),
            )
        ),
        Content.TestContent(
            Test(
                "", listOf(
                    Question(
                        id = 1,
                        questionText = "This building was built ... 1938.",
                        correctAnswer = "in",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "in",
                                "on",
                                "at",
                                "no preposition"
                            )
                        )
                    ),
                    Question(
                        id = 2,
                        questionText = "She is asleep now. She was very tired as she didn’t sleep ... the night.",
                        correctAnswer = "in",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "in",
                                "on",
                                "at",
                                "no preposition"
                            )
                        )
                    ),
                    Question(
                        id = 3,
                        questionText = "We met ... every Sunday morning to have breakfast together.",
                        correctAnswer = "no preposition",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "in",
                                "on",
                                "at",
                                "no preposition"
                            )
                        )
                    )
                )
            )
        )
    )
)

val questionForm = TopicDetail(
    listOf(
        Content.TitleContent("Общий вопрос в английском языке"),
        Content.SubtitleContent("Общий вопрос задается, чтобы получить подтверждение или опровержение высказанной мысли, то есть ответ «да» или «нет». \n Если сказуемое выражено глаголом to have или to be, то оно ставится в начале предложения. После него следует подлежащее:"),
        Content.ExamplesContent(
            listOf(
                Example("Are you still sleeping?", "Вы все еще спите?"),
                Example("Вы все еще спите?", "У вас нет лишней сигареты?"),
            )
        ),
        Content.SubtitleContent("Если сказуемое включает в себя вспомогательный или модальный глагол, то он (или первый из них, если их несколько) ставится перед подлежащим:"),
        Content.ExamplesContent(
            listOf(
                Example("Could you help me?", "Не могли бы вы мне помочь?"),
                Example("Would you like some coffee?", "Хочешь кофе?"),
            )
        ),
        Content.SubtitleContent("Если сказуемое выражено глаголом в Present Simple или Past Simple, то в качестве вспомогательного глагола нужно использовать do / does или did:"),
        Content.ExamplesContent(
            listOf(
                Example("Do you speak German?", "Вы говорите по-немецки?"),
                Example("Did you lose your wallet again?", "Ты опять потерял бумажник?"),
            )
        ),


        )
)

val pastSimple = TopicDetail(
    listOf(
        Content.TitleContent("Past Simple - простое прошедшее время"),
        Content.SubtitleContent("Время Past Simple используется для обозначения действия, которое произошло в определенное время в прошлом и время совершения которого уже истекло. Для уточнения момента совершения действия в прошлом при использовании времени Past Simple обычно используются такие слова, как:"),
        Content.ExamplesContent(
            listOf(
                Example("five days ago - пять дней назад"),
                Example("last year - в прошлом году"),
                Example("yesterday - вчера"),
            )
        ),
        Content.TitleContent("Образование Past Simple"),
        Content.SubtitleContent("Утвердительные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("I played", "We played")),
                Expression(listOf("You played", "You played")),
                Expression(listOf("He/she/it played", "They played")),
            )
        ),
        Content.SubtitleContent("Вопросительные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("Did I play?", "Did we play?")),
                Expression(listOf("Did you play?", "Did you play?")),
                Expression(listOf("Did he/she/it play?", "Did they play?")),
            )
        ),
        Content.SubtitleContent("Отрицательные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("I did not play", "We did not play")),
                Expression(listOf("You did not play", "You did not play")),
                Expression(listOf("He / she / it did not play", "They did not play")),
            )
        ),
        Content.SubtitleContent("Для того, чтобы поставить английский глагол во время Past Simple, нужно использовать его «вторую форму». Для большинства глаголов она образуется прибавлением окончания -ed:"),
        Content.ExamplesContent(
            listOf(
                Example("examine – examined"),
                Example("enjoy – enjoyed"),
                Example("close – closed"),
            )
        ),
        Content.SubtitleContent("Однако есть также достаточно большая группа неправильных английских глаголов, которые образуют форму прошедшего времени не по общим правилам, для них форму прошедшего времени нужно просто запомнить."),
        Content.ExamplesContent(
            listOf(
                Example(
                    "We saw your dog two blocks from here.",
                    "Мы видели вашу собаку в двух кварталах отсюда."
                )
            )
        ),
        Content.SubtitleContent("В вопросительном предложении перед подлежащим нужно использовать вспомогательный глагол do в прошедшем времени – did, а после подлежащего поставить основной, значимый глагол в начальной форме:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Did you wash your hands?",
                    "Ты помыл руки?"
                ),
                Example(
                    "Did they sign the contract?",
                    "Они подписали контракт?"
                )
            )
        ),
        Content.SubtitleContent("В вопросительном предложении перед подлежащим нужно использовать вспомогательный глагол do в прошедшем времени – did, а после подлежащего поставить основной, значимый глагол в начальной форме:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I saw Jeremy in the bank.",
                    "Я видел Джереми в банке."
                ),
                Example(
                    "The old man often visited me.",
                    "Старик часто меня навещал."
                ),
                Example(
                    "I noticed this charming shop girl each time I went to buy something.",
                    "Я замечал эту очаровательную продавщицу каждый раз, когда шел за покупками."
                ),
                Example(
                    "I heard a strange sound, looked back, and saw a huge cat sitting on the table.",
                    "Я услышал странный звук, обернулся и увидел здоровенного кота, сидящего на столе."
                )
            )
        ),
        Content.TestContent(
            Test(
                "", listOf(
                    Question(
                        id = 1,
                        questionText = " I _____ to the mall after school.",
                        correctAnswer = "went",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "goed",
                                "gone",
                                "went"
                            )
                        )
                    ),
                    Question(
                        id = 2,
                        questionText = "My brother _____ a bear an hour ago.",
                        correctAnswer = "saw",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "seen",
                                "saw",
                                "sees"
                            )
                        )
                    ),
                    Question(
                        id = 3,
                        questionText = "_____ Mike visit his grandmother last night?",
                        correctAnswer = "Did",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "Did",
                                "Are",
                                "Does"
                            )
                        )
                    )
                )
            )
        )
    )
)

val futureSimple = TopicDetail(
    listOf(
        Content.TitleContent("Future Simple - простое будущее время"),
        Content.SubtitleContent("Время Future Simple ссылается на действие, которое совершится в неопределенном или отдаленном будущем. Простое будущее время в английском языке обычно используется с обстоятельствами:"),
        Content.ExamplesContent(
            listOf(
                Example("tomorrow – завтра"),
                Example("next year – в следующем году"),
                Example("in five years – через пять лет"),
            )
        ),
        Content.TitleContent("Образование Future Simple"),
        Content.SubtitleContent("Утвердительные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("I will play", "We will play")),
                Expression(listOf("You will play", "You will play")),
                Expression(listOf("He / she / it will play", "They will play")),
            )
        ),
        Content.SubtitleContent("Вопросительные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("Will I play?", "Will we play?")),
                Expression(listOf("Will you play?", "Will you play?")),
                Expression(listOf("Will he / she / it play?", "Will they play?")),
            )
        ),
        Content.SubtitleContent("Отрицательные предложения:"),
        Content.TableContent(
            listOf(
                Expression(listOf("I will not play", "We will not play")),
                Expression(listOf("You will not play", "You will not play")),
                Expression(listOf("He / she / it will not play", "They will not play")),
            )
        ),
        Content.SubtitleContent("Для того, чтобы поставить английский глагол во время Past Simple, нужно использовать его «вторую форму». Для большинства глаголов она образуется прибавлением окончания -ed:"),
        Content.ExamplesContent(
            listOf(
                Example("examine – examined"),
                Example("enjoy – enjoyed"),
                Example("close – closed"),
            )
        ),
        Content.SubtitleContent(
            "Для того, чтобы поставить глагол во временную форму Future Simple, нужно использовать его начальную форму и вспомогательный глагол will. В устной речи will чаще всего сокращается до формы ‘ll, которая может использоваться во всех лицах.\n" +
                    "\n" +
                    "Примечание:\n" +
                    "Ранее при употреблении будущего времени для первого лица (I, we) было принято использовать вспомогательный глагол shall:"
        ),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I shall write to you every day.",
                    "Я буду писать тебе каждый день."
                )
            )
        ),
        Content.SubtitleContent("Однако, в современном английском, особенно в устной речи, will стал использоваться для всех лиц:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "I will go to Paris next summer.",
                    "Следующим летом я поеду в Париж."
                ),
            )
        ),
        Content.SubtitleContent("Глагол shall в настоящее время используется довольно редко в качестве модального глагола в предложении что-то сделать или помочь:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Shall we dance?",
                    "Может, потанцуем?"
                )

            )
        ),
        Content.SubtitleContent("В вопросительном предложении вспомогательный глагол will ставится перед подлежащим. Значимый глагол остается после подлежащего в своей начальной форме:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "Will we go to the beach?",
                    "Мы пойдем на пляж?"
                ),
                Example(
                    "Will your boss agree with our conditions?",
                    "Ваш босс согласится с нашими условиями?"
                )
            )
        ),
        Content.TitleContent("Случаи употребления Future Simple:"),
        Content.ExamplesContent(
            listOf(
                Example(
                    "We'll return in 4 hours.",
                    "Мы вернемся через 4 часа."
                ),
                Example(
                    "It will not be easy to convince him.",
                    "Его будет нелегко убедить."
                ),
                Example(
                    "I promise I'll visit you every day.",
                    "Обещаю, что буду навещать тебя каждый день."
                ),
                Example(
                    "I cannot wait for my vacation. I will go to the river, swim and fish every day..",
                    "Не могу дождаться своего отпуска. Буду каждый день ходить к речке, купаться и ловить рыбу."
                )
            )
        ),
        Content.TestContent(
            Test(
                "", listOf(
                    Question(
                        id = 1,
                        questionText = "He _____ arrive on time.",
                        correctAnswer = "will",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "will",
                                "is",
                                "not"
                            )
                        )
                    ),
                    Question(
                        id = 2,
                        questionText = "Will your folks _____ before Tuesday?",
                        correctAnswer = "leave",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "leaving",
                                "leave",
                                "leaves"
                            )
                        )
                    ),
                    Question(
                        id = 3,
                        questionText = "We _____ get there until after dark.",
                        correctAnswer = "won't",
                        answer = PossibleAnswer.SingleChoice(
                            listOf(
                                "will",
                                "won't",
                                "will'nt"
                            )
                        )
                    )
                )
            )
        )
    )
)


val beginnerTopics = listOf(
    verbToBe,
    pronoun,
    prepOfTime,
    pron,
    presentSimple,
    pastSimple,
    futureSimple,
    placeAdverb,
    questionForm
)
