package com.ainaz.ainazapp.presentation.yandexsearch

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ainaz.ainazapp.presentation.search.WordInfoItem
import com.ainaz.ainazapp.ui.theme.AinazAppTheme

@Composable
fun YandexSearchScreen() {

    val viewModel: YandexSearchVM = hiltViewModel()
    val state = viewModel.state.value

    AinazAppTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colors.background)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Box {
                    TextField(
                        value = viewModel.searchQuery.value,
                        onValueChange = viewModel::onSearch,
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Поиск...")
                        }
                    )

                    SearchType(
                        modifier = Modifier
                            .padding(4.dp)
                            .align(Alignment.CenterEnd),
                        onSelectionChanged = { selected ->
                            if (selected) {
                                viewModel.lang = "ru-en"
                            } else {
                                viewModel.lang = "en-ru"
                            }
                        }
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {

                    items(state.result.def.size) { i ->
                        val def = state.result?.def[i]
                        if (def != null) {
                            WordItem(def) {
                                viewModel.insertWordIntoUserDictionary(it)
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }
                }
            }
            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SearchType(
    modifier: Modifier,
    onSelectionChanged: (Boolean) -> Unit = {},
) {
    var isSelected by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier,
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        selected = isSelected,
        onClick = {
            isSelected = !isSelected
            onSelectionChanged(isSelected)
        }
    ) {
        val text = if (isSelected) "ru-en" else "en-ru"
        Text(
            text = text,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(8.dp)
        )
    }
}
