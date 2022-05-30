package com.ainaz.ainazapp.presentation.navigation

sealed class NavScreen(val route: String) {
    object GrammarScreen : NavScreen(route = "Grammar")
    object SearchScreen : NavScreen(route = "Search")
    object TestScreen : NavScreen(route = "Test")

    object TopicDetail : NavScreen(route = "TopicDetail/{topicId}")
}
