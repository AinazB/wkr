package com.ainaz.ainazapp.presentation.dictionary

import com.ainaz.ainazapp.domain.model.localdictionary.Word

data class DictionaryState(
    val result: List<Word> = emptyList(),
    val isLoading: Boolean = false
)
