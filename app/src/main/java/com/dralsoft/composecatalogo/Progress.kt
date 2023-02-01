package com.dralsoft.composecatalogo

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyProgress() {
    var showLoading by rememberSaveable { mutableStateOf(false) }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(modifier = Modifier.padding(top = 36.dp))
        }

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Show Loading")
        }
    }
}

@Composable
fun MyProgressAdvance() {
    var progress by rememberSaveable { mutableStateOf(0.0f) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progress)

        Row(Modifier.fillMaxWidth()) {
            Button(onClick = { progress += 0.1f }) {
                Text(text = "Incrementar")
            }

            Button(onClick = { progress -= 0.1f }) {
                Text(text = "Reducir")
            }
        }
    }
}