package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ainaz.ainazapp.presentation.grammar.Content.*
import com.ainaz.ainazapp.presentation.grammar.components.Table
import com.ainaz.ainazapp.presentation.grammar.model.topicDetailStub
import com.ainaz.ainazapp.presentation.test.PossibleAnswer
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2

@Composable
fun TopicDetail(topicId: Long?) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(topicDetailStub.content) { content ->
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
                    val question = content.test.questions.first()
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
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
                            (question.answer as PossibleAnswer.SingleChoice).optionsStringRes.forEachIndexed() { index, content ->
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
                                        selected = index == 0,
                                        onClick = {},
                                    )
                                }
                            }
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


