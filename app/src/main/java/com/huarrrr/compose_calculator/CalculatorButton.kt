package com.huarrrr.compose_calculator

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class ButtonType {
    Number,
    Special,
    Operator
}

enum class ButtonSize {
    Wide,
    Normal,
}

@Composable
fun CalculatorButton(
    type: ButtonType = ButtonType.Number,
    text: String,
    size: ButtonSize = ButtonSize.Normal,
    onClick: () -> Unit,
    isActive: Boolean = false
) {
    val bgColor = when (type) {
        ButtonType.Number -> MaterialTheme.colors.primaryVariant
        ButtonType.Special -> MaterialTheme.colors.secondaryVariant
        ButtonType.Operator -> MaterialTheme.colors.primary
    }
    val bgColorActive = if (isActive && type == ButtonType.Operator) Color.White else bgColor
    val fontColor =  if (type == ButtonType.Operator) Color.White else Color.Gray
    val fontColorActive = if (isActive && type == ButtonType.Operator) MaterialTheme.colors.primary else fontColor
    val defaultSize = 70
    val width = if (size == ButtonSize.Normal) defaultSize.dp else (defaultSize * 2).dp
    val fontSize =  if (type != ButtonType.Operator) (defaultSize / 2.2).sp else (defaultSize / 1.8).sp
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(width = width, height = defaultSize.dp)
            .clip(CircleShape),
        colors = ButtonDefaults.buttonColors(backgroundColor = bgColorActive)
    ,
    ) {
        Text(
            text = text,
            fontSize = if (text == "C") (defaultSize / 2.2).sp else fontSize,
            fontWeight = FontWeight.W400,
            color = fontColorActive,
            modifier = Modifier
                .padding(horizontal = 5.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun BtnPreview() {
    CalculatorButton(type = ButtonType.Number, text = "1", size = ButtonSize.Wide, onClick = {})
}