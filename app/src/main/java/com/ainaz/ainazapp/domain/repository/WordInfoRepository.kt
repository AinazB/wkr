package com.ainaz.ainazapp.domain.repository

import com.ainaz.ainazapp.domain.model.WordInfo
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}
