package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ainaz.ainazapp.presentation.grammar.Content.*
import com.ainaz.ainazapp.presentation.grammar.components.Table
import com.ainaz.ainazapp.presentation.grammar.model.advancedTopics
import com.ainaz.ainazapp.presentation.grammar.model.beginnerTopics
import com.ainaz.ainazapp.presentation.grammar.model.intermediateTopics
import com.ainaz.ainazapp.presentation.test.PossibleAnswer
import com.ainaz.ainazapp.presentation.test.Question
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2
import kotlinx.coroutines.coroutineScope

@Composable
fun TopicDetail(topicId: Long?, level: Int?) {
    var showTestResult = remember {
        mutableStateOf(false)
    }

    val topics = when (level) {
        0 -> beginnerTopics
        1 -> intermediateTopics
        2 -> advancedTopics
        else -> {
            intermediateTopics
        }
    }

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(topics[topicId?.toInt() ?: 0].content) { content ->
            when (content) {
                is TitleContent -> {
                    Text(
                        text = content.text,
                        modifier = Modifier.padding(8.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                is SubtitleContent -> {
                    Text(
                        text = content.text,
                        lineHeight = 28.sp,
                        modifier = Modifier.padding(8.dp),
                        fontSize = 18.sp
                    )
                }
                is ExamplesContent -> {
                    ExamplesContainer(examples = content.examples)
                }
                is ImageContent -> {

                }
                is TableContent -> {
                    val expressions = content.table
                    Table(content.table)
                }
                is TestContent -> {
                    val questions = content.test.questions
                    LazyRow(modifier = Modifier.fillMaxWidth()) {
                        items(questions) { question ->
                            TopicTest(question = question, onSelected = {
                                showTestResult.value = true
                            })
                        }
                    }

                }
            }
        }
    }
}


@Composable
fun ExamplesContainer(examples: List<Example>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 16.dp),
        backgroundColor = cardBackgroundColor2, shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
            examples.forEach { example ->
                Text(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    text = "- " + example.title,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = example.subtitle,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


@Composable
fun TopicTest(question: Question, onSelected: () -> Unit) {
    var selectedAnswer = remember {
        mutableStateOf("")
    }

    var showResult = remember {
        mutableStateOf(false)
    }

    if (showResult.value) {

    }

    Card(
        modifier = Modifier
            .width(350.dp)
            .padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 16.dp),
        backgroundColor = cardBackgroundColor2, shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = question.questionText,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        Column(modifier = Modifier.padding(16.dp)) {
            Spacer(modifier = Modifier.padding(16.dp))
            val answer = question.answer as PossibleAnswer.SingleChoice
            (answer).optionsStringRes.forEachIndexed() { index, content ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = content
                    )
                    RadioButton(
                        selected = selectedAnswer.value == content,
                        onClick = {
                            selectedAnswer.value = content
                            showResult.value = question.correctAnswer == selectedAnswer.value
                        },
                    )
                }
            }

            if (showResult.value) {
                Text(text = "Правильно!", modifier = Modifier.align(CenterHorizontally))
            }
        }
    }
}

