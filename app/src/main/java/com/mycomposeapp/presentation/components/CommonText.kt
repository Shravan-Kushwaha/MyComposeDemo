package com.mycomposeapp.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CommonText(
    text: String = "",
    modifier: Modifier = Modifier,
    color: Color = Color.Black,
    fontSize: TextUnit = 18.sp
) {
    Text(
        text = text,
        fontSize = fontSize,
        style = TextStyle(fontWeight = FontWeight.SemiBold),
        color = color,
        modifier = modifier
    )
}
