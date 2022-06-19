package com.ainaz.ainazapp.presentation.grammar

import com.ainaz.ainazapp.presentation.test.Test

sealed class Content {
    data class TitleContent(val text: String) : Content()
    data class SubtitleContent(val text: String) : Content()
    data class ExamplesContent(val examples: List<Example>) : Content()
    data class ImageContent(val imageUrl: String) : Content()
    data class TableContent(val table: List<Expression>) : Content()
    data class TestContent(val test: Test) : Content()
}

data class Example(val title: String, val subtitle: String = "")

data class Expression(val forms: List<String>)

data class TopicDetail(
    val content: List<Content>
)
