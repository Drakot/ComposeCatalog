package com.dralsoft.composecatalogo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment


@Composable
fun BasicSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(value = sliderPosition, onValueChange = {
            sliderPosition = it
        })
        Text(sliderPosition.toString())
    }
}

@Composable
fun AdvanceSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by remember { mutableStateOf(0f) }
        var completeValue by remember { mutableStateOf("") }
        Slider(
            value = sliderPosition, onValueChange = {
                sliderPosition = it
            },
            onValueChangeFinished = {completeValue = sliderPosition.toString()},
            valueRange = 0f..10f,
            steps = 9,
        )
        Text(completeValue)
    }
}