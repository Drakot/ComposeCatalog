package com.dralsoft.composecatalogo.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        contentColor = Color.Green,
        backgroundColor = Color.Blue,
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Ej 1")
            Text(text = "Ej 2")
            Text(text = "Ej 3")
        }
    }
}