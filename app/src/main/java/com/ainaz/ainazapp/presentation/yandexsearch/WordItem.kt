package com.ainaz.ainazapp.presentation.yandexsearch

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ainaz.ainazapp.data.model.translate.Def
import com.ainaz.ainazapp.data.model.translate.Ex


@Composable
fun WordItem(def: Def, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "${def.text} (${def.pos})",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = def.ts)
            Spacer(modifier = Modifier.height(4.dp))

            val translations = def.copy().tr.joinToString(
                separator = ", ",
                postfix = "."
            ) { it.text }

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Варианты перевода: $translations", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))

            if (def.tr.firstOrNull()?.ex?.isNotEmpty() == true) {
                Text(text = "Примеры:", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
            }

            def?.tr?.forEach {
                it?.ex?.forEach {
                    ExampleItem(example = it)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExampleItem(example: Ex) {
    var expanded by remember { mutableStateOf(false) }
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = { expanded = !expanded }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(animationSpec = tween())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = example.text, fontSize = 16.sp)
                if (!expanded) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = null)
                }
            }
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                example.tr.forEach {
                    Text(text = "- ${it.text}", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}
