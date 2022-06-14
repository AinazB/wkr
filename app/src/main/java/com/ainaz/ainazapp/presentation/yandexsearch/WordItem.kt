package com.ainaz.ainazapp.presentation.yandexsearch

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ainaz.ainazapp.R
import com.ainaz.ainazapp.data.model.translate.remote.Def
import com.ainaz.ainazapp.data.model.translate.remote.Ex
import com.ainaz.ainazapp.domain.model.localdictionary.Word


@Composable
fun WordItem(def: Def, modifier: Modifier = Modifier, onClick: (Word) -> Unit) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "${def.text} (${def.pos})",
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                )

                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    Modifier.clickable {
                        onClick(
                            Word(
                                text = def.text,
                                translation = def?.tr[0]?.text,
                                transcription = def.ts,
                                pos = def.pos,
                                0
                            )
                        )
                    })
            }

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
                    //Icon(imageVector = Icons.Default.Info, contentDescription = null)
                    Icon(painter = painterResource(id = R.drawable.ic_baseline_translate_24), null)

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
