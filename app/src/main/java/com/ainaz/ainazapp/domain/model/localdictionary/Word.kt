package com.ainaz.ainazapp.domain.model.localdictionary

import com.ainaz.ainazapp.data.model.translate.local.WordInfo

data class Word(
    val text: String = "",
    val translation: String = "",
    val transcription: String = "",
    val pos: String = "",
    val iteration: Int = 0
) {
    fun mapToWordDto(): WordInfo {
        return WordInfo(
            text = text,
            translation = translation,
            transcription = transcription,
            pos = pos,
            iteration = iteration
        )
    }
}
