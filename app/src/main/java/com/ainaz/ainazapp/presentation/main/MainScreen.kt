package com.ainaz.ainazapp.presentation.main

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ainaz.ainazapp.presentation.grammar.GrammarScreen
import com.ainaz.ainazapp.presentation.grammar.TopicDetail
import com.ainaz.ainazapp.presentation.navigation.NavScreen
import com.ainaz.ainazapp.presentation.dictionary.SearchScreen
import com.ainaz.ainazapp.presentation.test.TestScreen

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
            GrammarScreen(navController = navController)
        }

        composable(NavScreen.SearchScreen.route) {
            SearchScreen()
        }

        composable(NavScreen.TestScreen.route) {
            TestScreen()
        }

        composable(
            NavScreen.TopicDetail.route,
            arguments = listOf(navArgument("topicId") {
                type = NavType.LongType
            })
        ) { backStackEntry ->
            TopicDetail(backStackEntry.arguments?.getLong("topicId"))
        }
    }
}
