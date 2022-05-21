package com.ainaz.ainazapp.presentation.main

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ainaz.ainazapp.presentation.grammar.GrammarScreen
import com.ainaz.ainazapp.presentation.navigation.NavScreen
import com.ainaz.ainazapp.presentation.search.SearchScreen

@Composable
fun MainScreen(
    navController: NavHostController,
    scaffoldState: ScaffoldState,
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.GrammarScreen.route
    ) {
        composable(NavScreen.GrammarScreen.route) {
            GrammarScreen()
        }

        composable(NavScreen.SearchScreen.route) {
            SearchScreen()
        }

        composable(NavScreen.TestScreen.route) {
            SearchScreen()
        }
    }
}
