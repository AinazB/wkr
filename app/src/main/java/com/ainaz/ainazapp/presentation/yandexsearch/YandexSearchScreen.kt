package com.ainaz.ainazapp.presentation.yandexsearch

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                TextField(
                    value = viewModel.searchQuery.value,
                    onValueChange = viewModel::onSearch,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Поиск...")
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {

                    items(state.result.def.size) { i ->
                        val wordInfo = state.result.def[i]
                        if (i > 0) {
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                        wordInfo.tr.forEach {
                            Text(text = it.text)
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
