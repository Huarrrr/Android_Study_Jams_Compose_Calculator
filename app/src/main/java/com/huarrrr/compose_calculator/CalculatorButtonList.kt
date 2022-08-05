package com.huarrrr.compose_calculator

import androidx.compose.runtime.Composable

data class CalculatorButton(
    val type: ButtonType = ButtonType.Number,
    val text: String,
    val size: ButtonSize = ButtonSize.Normal,
    val onClick: () -> Unit
)


val CalculatorButtonList = listOf(
    CalculatorButton(type = ButtonType.Special, text = "C", onClick = {}),
    CalculatorButton(type = ButtonType.Special, text = "±", onClick = {}),
    CalculatorButton(type = ButtonType.Special, text = "%", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "÷", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "7", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "8", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "9", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "×", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "4", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "5", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "6", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "–", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "1", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "2", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "3", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "+", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "0", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = ".", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "=",size = ButtonSize.Wide, onClick = {}),
)

@Composable
fun CalculatorButton.ToCalculatorButton(onClick: () -> Unit, isActive: Boolean = false) {
    CalculatorButton(text = text, size = size, onClick = onClick, type = type, isActive = isActive)
}