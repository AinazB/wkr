package com.ainaz.ainazapp.presentation.vocabulary

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ainaz.ainazapp.domain.model.localdictionary.Word
import com.ainaz.ainazapp.presentation.theme.cardBackgroundColor2

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LexItem(title: String, subtitle: String, onClick: (Word) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        backgroundColor = cardBackgroundColor2, shape = RoundedCornerShape(12.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.weight(0.9f),
                    text = title,
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    Modifier
                        .weight(0.1f)
                        .clickable {
                            onClick(
                                Word(
                                    text = title ?: "",
                                    translation = subtitle
                                )
                            )
                        })
            }
            Text(
                text = subtitle,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
