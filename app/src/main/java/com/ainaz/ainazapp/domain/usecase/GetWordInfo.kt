package com.ainaz.ainazapp.domain.usecase

import com.ainaz.ainazapp.domain.model.dictionary.WordInfo
import com.ainaz.ainazapp.domain.repository.WordInfoRepository
import com.ainaz.ainazapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow { }
        }
        return repository.getWordInfo(word)
    }
}
