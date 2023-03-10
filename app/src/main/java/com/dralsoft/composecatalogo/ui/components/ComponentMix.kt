package com.dralsoft.composecatalogo.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.dralsoft.composecatalogo.MyTextField
import com.dralsoft.composecatalogo.ui.theme.*


@Composable
fun MyStateExample() {
    var counter by rememberSaveable { mutableStateOf(0) }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            counter++
        }) {
            Text("Pulsar")
        }
        Text("He sido pulsado ${counter} veces")
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Black), contentAlignment = Alignment.Center
        ) {
            Text(text = "Que tal la vida")
        }

        MySpacer(23)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Teal200), contentAlignment = Alignment.Center
            ) {
                Text(text = "Que tal la vida")
            }

            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Un poco de pena")
            }
        }

        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Purple700), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Kiketurty puto amo", color = Color.White)
        }
    }
}

@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MyRow() {
    /*   Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly){
           Text(text = "Hello Bitch 1e e e")
           Text(text = "Hello Bitch 2e e e")
           Text(text = "Hello Bitch 3e e e")
       }*/

    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(text = "Hello Bitch 1e e e", modifier = Modifier.width(300.dp))
        Text(text = "Hello Bitch 2e e e", modifier = Modifier.width(300.dp))
        Text(text = "Hello Bitch 3e e e", modifier = Modifier.width(300.dp))
        Text(text = "Hello Bitch 4e e e", modifier = Modifier.width(300.dp))
    }
}


@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Hello Bitch 1e e e", modifier = Modifier
                .background(Purple200)
                .height(300.dp)
        )
        Text(
            text = "Hello Bitch 2e e e", modifier = Modifier
                .background(Teal200)
                .height(300.dp)
        )
        Text(
            text = "Hello Bitch 3e e e", modifier = Modifier
                .background(Purple700)
                .height(300.dp)
        )
        Text(
            text = "Hello Bitch 4e e e", modifier = Modifier
                .background(Black)
                .height(300.dp)
        )
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState()), contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello Bitch e e e")
        }
    }
}


@Composable
fun MyButtonExample() {
    var enabled by remember { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            onClick = {
                enabled = !enabled
            }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Red, contentColor = Color.Blue
            ), border = BorderStroke(2.dp, Color.Green), enabled = enabled
        ) {
            Text(text = "Pulsar")
        }

        OutlinedButton(
            modifier = Modifier.padding(top = 0.dp), onClick = {

            }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Red,
                contentColor = Color.Blue,
                disabledBackgroundColor = Color.White,
                disabledContentColor = Color.Black
            ), enabled = false
        ) {
            Text(text = "Hola")
        }

        TextButton(
            onClick = {

            }, colors = ButtonDefaults.textButtonColors(
                contentColor = Color.Blue,
            )
        ) {
            Text(text = "Text Button")
        }
    }
}

@Composable
fun DefaultPreviewHoisting() {
    ComposeCatalogoTheme {
        Column() {
            var myText by remember { mutableStateOf("") }
            MyTextField(myText) {
                myText = it
            }
        }
    }
}