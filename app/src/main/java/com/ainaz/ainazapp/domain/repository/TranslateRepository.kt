package com.ainaz.ainazapp.domain.repository

import com.ainaz.ainazapp.data.model.translate.remote.TranslationDTO
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface TranslateRepository {

    fun translate(text: String, lang: String): Flow<Resource<TranslationDTO>>
}
