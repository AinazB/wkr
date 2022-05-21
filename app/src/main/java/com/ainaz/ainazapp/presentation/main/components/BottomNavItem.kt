package com.ainaz.ainazapp.presentation.main.components

import com.ainaz.ainazapp.R
import com.ainaz.ainazapp.presentation.navigation.NavScreen


data class BottomNavItem(
    val title: String,
    val icon: Int,
    val route: String
)

fun provideBottomNavItems() = listOf(
    BottomNavItem(
        NavScreen.GrammarScreen.route,
        R.drawable.ic_menu_grammar,
        NavScreen.GrammarScreen.route
    ),
    BottomNavItem(
        NavScreen.SearchScreen.route,
        R.drawable.ic_search,
        NavScreen.SearchScreen.route
    ),
    BottomNavItem(
        NavScreen.TestScreen.route,
        R.drawable.ic_menu_test,
        NavScreen.TestScreen.route
    )
)
