package com.ainaz.ainazapp.presentation.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF4DB3B6)
val Purple700 = Color(0xFF1B4E46)
val Teal200 = Color(0xFF03DAC5)
val Teal700 = Color(0xFF018786)

val cardBackgroundColor = Color(0xFFCAC9C9)
val cardBackgroundColor2 = Color(0xFFEDE8E8)

val Colors.progressIndicatorBackground: Color
    @Composable
    get() = if (isLight) Color.Black.copy(alpha = 0.12f) else Color.White.copy(alpha = 0.24f)

