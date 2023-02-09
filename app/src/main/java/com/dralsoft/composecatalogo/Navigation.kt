package com.dralsoft.composecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun Screen1(navigation: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(text = "Screen 1", modifier = Modifier
            .background(Color.White)
            .clickable {
                navigation.navigate(Route.Pantalla2.route)
            })
    }
}

@Composable
fun Screen2(navigation: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(text = "Screen 2", modifier = Modifier
            .background(Color.White)
            .clickable {
                navigation.navigate(Route.Pantalla3.route)
            })
    }
}

@Composable
fun Screen3(navigation: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(text = "Screen 3", modifier = Modifier
            .background(Color.White)
            .clickable {
                navigation.navigate(Route.Pantalla4.createRoute(2))
            })
    }
}

@Composable
fun Screen4(navigation: NavHostController, age: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Text(text = age.toString(), modifier = Modifier
            .background(Color.White)
            .clickable {
                navigation.popBackStack()
            })
    }
}