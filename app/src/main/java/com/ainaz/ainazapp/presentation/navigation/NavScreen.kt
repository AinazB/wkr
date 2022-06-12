package com.ainaz.ainazapp.presentation.navigation

sealed class NavScreen(val route: String) {
    object GrammarScreen : NavScreen(route = "Grammar")
    object SearchScreen : NavScreen(route = "Search")
    object TestScreen : NavScreen(route = "Test")
    object DictionaryScreen : NavScreen(route = "Dictionary")
    object YandexSearchScreen : NavScreen(route = "YandexSearchScreen")

    object TopicDetail : NavScreen(route = "TopicDetail/{topicId}")
}
