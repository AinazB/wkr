package com.ainaz.ainazapp.presentation.grammar.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ainaz.ainazapp.presentation.grammar.Expression

@Composable
fun Table(rows: List<Expression>) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        rows.forEach { row ->
            Row(Modifier.fillMaxWidth()) {
                row.forms.forEach { cell ->
                    TableCell(text = cell, weight = 1f / row.forms.count())
                }
            }
        }
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .border(1.dp, Color.Black)
            .weight(weight)
            .padding(8.dp)
    )
}
