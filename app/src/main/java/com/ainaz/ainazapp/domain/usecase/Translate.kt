package com.ainaz.ainazapp.domain.usecase

import com.ainaz.ainazapp.data.model.translate.remote.TranslationDTO
import com.ainaz.ainazapp.domain.repository.TranslateRepository
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Translate(
    private val repository: TranslateRepository
) {

    operator fun invoke(text: String): Flow<Resource<TranslationDTO>> {
        if (text.isBlank()) {
            return flow {}
        }
        return repository.translate(text)
    }
}
