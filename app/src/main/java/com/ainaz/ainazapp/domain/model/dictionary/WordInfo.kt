package com.ainaz.ainazapp.domain.model.dictionary

data class WordInfo(
    val meanings: List<Meaning> = emptyList(),
    val origin: String = "",
    val phonetic: String = "",
    val word: String = "",
    val translation: String = ""
)
