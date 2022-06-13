package com.ainaz.ainazapp.data.repository

import com.ainaz.ainazapp.data.model.translate.remote.TranslationDTO
import com.ainaz.ainazapp.data.remote.TranslatorApi
import com.ainaz.ainazapp.domain.repository.TranslateRepository
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TranslateRepositoryImpl(private val translatorApi: TranslatorApi) : TranslateRepository {

    override fun translate(text: String): Flow<Resource<TranslationDTO>> = flow {
        emit(Resource.Loading())
        val result = translatorApi.translate(text = text)
        emit(Resource.Success(result))
    }
}
