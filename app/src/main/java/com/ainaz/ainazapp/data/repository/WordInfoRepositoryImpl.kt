package com.ainaz.ainazapp.data.repository

import com.ainaz.ainazapp.data.remote.DictionaryApi
import com.ainaz.ainazapp.domain.model.dictionary.WordInfo
import com.ainaz.ainazapp.domain.repository.WordInfoRepository
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WordInfoRepositoryImpl(
    private val api: DictionaryApi,
) : WordInfoRepository {

    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow {
        emit(Resource.Loading())
        val remoteData = api.getWordInfo(word)
        emit(Resource.Success(remoteData.map { it.toWordInfo() }))
    }
}
