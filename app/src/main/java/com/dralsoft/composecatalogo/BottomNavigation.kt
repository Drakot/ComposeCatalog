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

@Composable
fun MyBottomNavigation() {
    BottomNavigation {

        BottomNavigationItem(selected = false, onClick = {

        }, icon = {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
        }, label = {
            Text(text = "Home")
        })

        BottomNavigationItem(selected = false, onClick = {

        }, icon = {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Home")
        }, label = {
            Text(text = "FAV")
        })

        BottomNavigationItem(selected = false, onClick = {

        }, icon = {
            Icon(imageVector = Icons.Filled.Person, contentDescription = "Home")
        }, label = {
            Text(text = "Person")
        })
    }


}