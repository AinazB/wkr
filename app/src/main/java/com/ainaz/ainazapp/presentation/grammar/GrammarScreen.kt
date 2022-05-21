package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.*

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GrammarScreen() {
    val pagerState = rememberPagerState()
    val pages = listOf(
        "Начальный",
        "Средний",
        "Продвинутый"
    )
    Column {
        TabLayout(pagerState, pages)
        HorizontalPager(3, state = pagerState) {
            Text(text = "page = $currentPage", modifier = Modifier.fillMaxSize())
        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabLayout(pagerState: PagerState, pages: List<String>, onPageSelected: (PagerState) -> Unit) {
    TabRow(
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
                text = { Text(text = title) },
                selected = pagerState.currentPage == index,
                onClick = {

                }
            )
        }
    }
}
