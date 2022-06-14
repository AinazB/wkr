package com.ainaz.ainazapp.data.model.translate.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ainaz.ainazapp.domain.model.localdictionary.Word

@Entity
data class WordInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val text: String?,
    val translation: String?,
    val transcription: String?,
    val pos: String?,
    val note: String?,
    val iteration: Int?
) {
    fun mapToDomain(): Word {
        return Word(
            text ?: "",
            translation ?: "",
            transcription ?: "",
            pos ?: "",
            note ?: "",
            iteration ?: 0
        )
    }
}
