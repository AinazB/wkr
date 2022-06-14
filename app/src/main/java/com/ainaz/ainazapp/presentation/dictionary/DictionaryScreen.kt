package com.ainaz.ainazapp.presentation.dictionary

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
    val showWordInfoDialog = remember { mutableStateOf(false) }
    val showAddNewWordDialog = remember { mutableStateOf(false) }

    if (showWordInfoDialog.value) {
        WordInfoDialog(showState = showWordInfoDialog)
    }

    if (showAddNewWordDialog.value) {
        AddNewWordDialog(showState = showAddNewWordDialog) { word, translate, note ->
            viewModel.addNewWord(
                Word(
                    text = word,
                    translation = translate,
                    note = note
                )
            )
        }
    }

    if (uiState.value.result.isEmpty()) {
        EmptyListPlaceHolder()
    }
    Box(Modifier.fillMaxHeight()) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            LazyColumn {
                item {
                    HeaderItem { navController.navigate(NavScreen.SearchScreen.route) }
                }
                items(uiState.value.result) { word ->
                    WordItem(word = word) {
                        showWordInfoDialog.value = true
                    }
                }
                item {
                    Spacer(modifier = Modifier.height(100.dp))
                }
            }

            if (uiState.value.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
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
                onClick = { navController.navigate(NavScreen.SearchScreen.route) }) {
                Text(text = "Добавить", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun HeaderItem(onClick: () -> Unit) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Мой список",
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
    )
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
                text = "${word.text} (${word.pos})",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = word.transcription,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = word.translation,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun EmptyListPlaceHolder() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ваш список пуст", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Text(
            "Вы можете добавить новые слова в общем словаре (иконка поиск) или нажав на кнопку добавить.",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
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
