package com.dralsoft.composecatalogo

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp


@Composable
fun MyCheckbox() {
    var state by rememberSaveable { mutableStateOf(true) }

    Checkbox(
        checked = state, onCheckedChange = {
            state = !state
        }, colors = CheckboxDefaults.colors(
            /* checkedColor = Color.Red,
             uncheckedColor = Color.Blue,
             checkmarkColor = Color.Green*/
        )
    )
}


@Composable
fun MyCheckboxAdvance() {
    var state by rememberSaveable { mutableStateOf(true) }

    Row(Modifier.padding(8.dp)) {
        Checkbox(checked = state, onCheckedChange = { state = !state })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Checkbox", modifier = Modifier.align(Alignment.CenterVertically), color = Color.White)
    }
}


@Composable
fun MyCheckboxAdvanceCompleted(checkInfo: CheckInfo) {
    Row(Modifier.padding(8.dp)) {
        Checkbox(checked = checkInfo.selected, onCheckedChange = { checkInfo.onChecked(!checkInfo.selected) })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = checkInfo.title, modifier = Modifier.align(Alignment.CenterVertically))
    }

}

@Composable
fun MyCheckboxsHoisting() {
    Column {
        getOptions(arrayListOf("Charles", "Widmore", "Ryan")).forEach {
            MyCheckboxAdvanceCompleted(it)
        }
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {

    return titles.map {
        var state by rememberSaveable { mutableStateOf(false) }
        CheckInfo(it, state) { newStatus ->
            state = newStatus
        }
    }
}

@Composable
fun MyTriStatusChekBox() {
    var state by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = state, onClick = {
        state = when (state) {
            ToggleableState.Off -> ToggleableState.On
            ToggleableState.On -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.Off
        }
    })
}

