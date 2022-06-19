package com.ainaz.ainazapp.presentation.learn

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.wajahatkarim.flippable.Flippable
import com.wajahatkarim.flippable.rememberFlipController
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LearnWordsScreen(
    navController: NavController,

    ) {
    val viewModel: LearnWordsVM = hiltViewModel()
    val uiState = viewModel.state

    HorizontalPager(count = uiState.value.result.size, modifier = Modifier.fillMaxSize()) { page ->
        Flippable(
            modifier = Modifier
                .size(360.dp)
                .graphicsLayer {
                    val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                    lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }
                    alpha = lerp(
                        start = 0.5f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
                },
            frontSide = {
                CardContainer {
                    Text(
                        text = uiState.value.result[page].text,
                        style = MaterialTheme.typography.h6,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    if (uiState.value.result[page].transcription.isNotEmpty()) {
                        Text(
                            text = uiState.value.result[page].transcription,
                            style = MaterialTheme.typography.h6
                        )
                    }
                }

            },
            backSide = {
                CardContainer {
                    Text(
                        text = uiState.value.result[page].translation,
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(8.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            },
            flipController = rememberFlipController()
        )
    }
}


@Composable
fun CardContainer(content: @Composable () -> Unit) {
    Surface(
        color = cardBackgroundColor2,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}

