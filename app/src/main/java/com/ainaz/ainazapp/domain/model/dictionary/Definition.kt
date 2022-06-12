package com.ainaz.ainazapp.domain.model.dictionary

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)
