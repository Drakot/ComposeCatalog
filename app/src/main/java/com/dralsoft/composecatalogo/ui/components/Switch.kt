package com.dralsoft.composecatalogo.ui.components

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun MySwitch() {
    var state by rememberSaveable { mutableStateOf(true) }

    Switch(
        checked = state, onCheckedChange = {
            state = !state
        }, colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Red,
            uncheckedThumbColor = Color.Blue,
            checkedTrackColor = Color.Green
        )
    )
}