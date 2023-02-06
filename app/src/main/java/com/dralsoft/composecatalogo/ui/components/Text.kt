package com.dralsoft.composecatalogo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Ejemplo 1")
        Text(text = "Ejemplo 2", color = Color.Blue)
        Text(text = "Ejemplo 2", fontWeight = FontWeight.Thin)
        Text(text = "Ejemplo 2", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(text = "Ejemplo 2", textDecoration = TextDecoration.Underline, fontSize = 30.sp)
    }
}

@Composable
fun MyTextField(name: String, onValue: (String) -> Unit) {

    TextField(value = name, onValueChange = onValue)
}

@Composable
fun MyTextFieldAdvance() {
    var myText by remember { mutableStateOf("") }
    TextField(value = myText, onValueChange = {
        myText = if (it.contains("a")) {
            it.replace("a", "")
        } else {
            it
        }
    }, label = { Text(text = "Introduce tu nombre") })
}

@Composable
fun MyTextFieldOutlined() {
    var myText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = {
            myText = it
        },
        modifier = Modifier.padding(16.dp),
        label = { Text(text = "Introduce tu nombre") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta, unfocusedBorderColor = Color.Red
        )
    )
}