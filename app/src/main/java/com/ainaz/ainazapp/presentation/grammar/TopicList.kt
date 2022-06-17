package com.ainaz.ainazapp.presentation.grammar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ainaz.ainazapp.presentation.grammar.model.Topic
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2

@Composable
fun TopicList(
    navController: NavController,
    modifier: Modifier,
    topics: List<Topic>,
    level: Int,
    onClick: () -> Unit
) {
    LazyColumn(modifier = modifier.padding(8.dp)) {
        itemsIndexed(topics) { index, topic ->
            TopicListItem(topic = topic) {
                navController.navigate("TopicDetail/$index/$level")
            }
        }
    }


}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TopicListItem(topic: Topic, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        backgroundColor = cardBackgroundColor2, shape = RoundedCornerShape(12.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = topic.title,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = topic.subtitle,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

