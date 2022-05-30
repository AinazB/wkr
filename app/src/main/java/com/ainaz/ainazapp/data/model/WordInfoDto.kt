package com.ainaz.ainazapp.data.model

import com.ainaz.ainazapp.domain.model.WordInfo


data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings.map {
                it.toMeaning()
            },
            word = word,
            origin = origin ?: "",
            phonetic = phonetic ?: ""
        )
    }
}

