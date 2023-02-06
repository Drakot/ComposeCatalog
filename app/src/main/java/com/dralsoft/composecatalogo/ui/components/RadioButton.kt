package com.dralsoft.composecatalogo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRadioButton() {
    var state by rememberSaveable { mutableStateOf(false) }
    RadioButton(
        selected = state, onClick = {

        }, colors = RadioButtonDefaults.colors(
            selectedColor = Color.Red,
            unselectedColor = Color.Blue,
            disabledColor = Color.Green
        )
    )
}

@Composable
fun MyRadioButtonHoistingList() {
    var state by rememberSaveable { mutableStateOf("Charles") }
    Column(Modifier.fillMaxWidth()) {
        MyRadioButtonList(state) {
            state = it
        }
    }
}

@Composable
fun MyRadioButtonList(name: String, onSelected: (String) -> Unit) {

    Column(Modifier.fillMaxWidth()) {
        Row() {
            RadioButton(
                selected = name == "Charles",
                onClick = { onSelected("Charles") }
            )
            Text(text = "Charles", modifier = Modifier.align(Alignment.CenterVertically))
        }

        Row() {
            RadioButton(
                selected = name == "Widmore",
                onClick = { onSelected("Widmore") }
            )
            Text(text = "Widmore", modifier = Modifier.align(Alignment.CenterVertically))
        }

        Row() {
            RadioButton(
                selected = name == "Geralt",
                onClick = { onSelected("Geralt") }
            )
            Text(text = "Geralt", modifier = Modifier.align(Alignment.CenterVertically))
        }

        Row() {
            RadioButton(
                selected = name == "Rivia",
                onClick = { onSelected("Rivia") }
            )
            Text(text = "Rivia", modifier = Modifier.align(Alignment.CenterVertically))
        }
    }
}