package com.dralsoft.composecatalogo

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun MyBottomNavigation() {
    var index by remember { mutableStateOf(0) }
    BottomNavigation(backgroundColor = Color.Red, contentColor = Color.White) {

        BottomNavigationItem(selected = index == 0, onClick = {
            index = 0
        }, icon = {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
        }, label = {
            Text(text = "Home")
        })

        BottomNavigationItem(selected = index == 1, onClick = {
            index = 1
        }, icon = {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Home")
        }, label = {
            Text(text = "FAV")
        })

        BottomNavigationItem(selected = index == 2, onClick = {
            index = 2
        }, icon = {
            Icon(imageVector = Icons.Filled.Person, contentDescription = "Home")
        }, label = {
            Text(text = "Person")
        })
    }


}