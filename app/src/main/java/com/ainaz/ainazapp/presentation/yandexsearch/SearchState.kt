package com.ainaz.ainazapp.presentation.yandexsearch

import com.ainaz.ainazapp.data.model.translate.Head
import com.ainaz.ainazapp.data.model.translate.TranslationDTO

data class SearchState(
    val result: TranslationDTO = TranslationDTO(emptyList()),
    val isLoading: Boolean = false
)
