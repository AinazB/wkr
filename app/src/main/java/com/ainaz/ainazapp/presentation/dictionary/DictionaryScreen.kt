package com.ainaz.ainazapp.presentation.dictionary

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ainaz.ainazapp.domain.model.dictionary.WordInfo
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import com.ainaz.ainazapp.presentation.navigation.NavScreen
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2

@Composable
fun DictionaryScreen(navController: NavController) {
    val viewModel: DictionaryVM = hiltViewModel()
    val uiState = viewModel.state

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        LazyColumn {
            item {
                HeaderItem { navController.navigate(NavScreen.SearchScreen.route) }
            }
            items(uiState.value.result) { word ->
                WordItem(word = word) {

                }
            }

        }
        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedButton(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(16.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Учить", fontWeight = FontWeight.Bold)
            }
            OutlinedButton(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(16.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Добавить", fontWeight = FontWeight.Bold)
            }

        }
        if (uiState.value.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }

    }

}

@Composable
fun HeaderItem(onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Мой список",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
        )

        IconButton(onClick = { onClick() }) {
            Icon(imageVector = Icons.Filled.Search, contentDescription = "")
        }
    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WordItem(word: Word, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        backgroundColor = cardBackgroundColor2, shape = RoundedCornerShape(12.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = word.text,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = word.translation,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

//val words = listOf(
//    WordInfo(word = "Well", translation = "Хорошо", origin = "in a good or satisfactory way."),
//    WordInfo(
//        word = "Room",
//        translation = "Комната",
//        origin = "an extent of space occupied by or sufficient or available for something."
//    ),
//    WordInfo(word = "Very", translation = "Очень", origin = "in a high degree."),
//    WordInfo(
//        word = "Slice",
//        translation = "Ломтик",
//        origin = "a thin, broad piece of food, such as bread, meat, or cake, cut from a larger portion."
//    ),
//    WordInfo(
//        word = "Enhance",
//        translation = "Усиливать",
//        origin = "intensify, increase, or further improve the quality, value, or extent of."
//    ),
//)
//
