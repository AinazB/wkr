package com.ainaz.ainazapp.presentation.dictionary

import com.ainaz.ainazapp.domain.model.WordInfo

data class DictionaryState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
