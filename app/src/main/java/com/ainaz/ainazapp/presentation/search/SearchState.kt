package com.ainaz.ainazapp.presentation.search

import com.ainaz.ainazapp.domain.model.dictionary.WordInfo

data class SearchState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
