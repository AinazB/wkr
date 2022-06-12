package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ainaz.ainazapp.presentation.grammar.model.Topic
import com.ainaz.ainazapp.presentation.grammar.model.advanced
import com.ainaz.ainazapp.presentation.grammar.model.beginner
import com.ainaz.ainazapp.presentation.grammar.model.intermediate
import com.google.accompanist.pager.*
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class, ExperimentalSnapperApi::class)
@Composable
fun GrammarScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val pages = listOf(
        "Начальный",
        "Средний",
        "Продвинутый"
    )
    Column {
        TabLayout(pagerState, pages)
        HorizontalPager(
            3, state = pagerState
        ) {
            when(pagerState.currentPage) {
                0 -> {
                    TopicList(
                        navController = navController,
                        modifier = Modifier.fillMaxSize(),
                        topics = beginner
                    ) {

                    }
                }
                1 -> {
                    TopicList(
                        navController = navController,
                        modifier = Modifier.fillMaxSize(),
                        topics = intermediate
                    ) {

                    }
                }
                2 -> {
                    TopicList(
                        navController = navController,
                        modifier = Modifier.fillMaxSize(),
                        topics = advanced
                    ) {

                    }
                }
            }

        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabLayout(pagerState: PagerState, pages: List<String>) {
    val scope = rememberCoroutineScope()
    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )
        }
    ) {
        pages.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(
                        text = title, fontSize = 16.sp
                    )
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}
