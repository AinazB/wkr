package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TopicDetail(topicId: Long?) {
    Text(text = topicId.toString())
}