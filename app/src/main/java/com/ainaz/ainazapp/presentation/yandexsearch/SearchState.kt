package com.ainaz.ainazapp.presentation.yandexsearch

import com.ainaz.ainazapp.data.model.translate.remote.TranslationDTO

data class SearchState(
    val result: TranslationDTO = TranslationDTO(emptyList()),
    val isLoading: Boolean = false
)
