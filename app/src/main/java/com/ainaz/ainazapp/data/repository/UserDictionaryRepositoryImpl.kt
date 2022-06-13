package com.ainaz.ainazapp.data.repository

import com.ainaz.ainazapp.data.local.UserDictionaryDAO
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserDictionaryRepositoryImpl(val dao: UserDictionaryDAO) {

    fun getUserWords(): Flow<Resource<List<Word>>> = flow {
        emit(Resource.Loading())
        dao.getAllWords().collect { it ->
            val userWords = it.map { it.mapToDomain() }
            emit(Resource.Success(userWords))
        }
    }

    suspend fun addNewWord(word: Word) {
        dao.insertWord(word.mapToWordDto())
    }

    suspend fun removeWord(word: Word) {
        dao.deleteWord(word.mapToWordDto())
    }
}
