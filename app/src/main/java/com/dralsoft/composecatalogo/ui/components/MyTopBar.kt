package com.dralsoft.composecatalogo.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyTopAppBar(onClick: (String) -> Unit,onClickDrawer: () -> Unit) {
    TopAppBar(title = {
        Text(text = "Mi primera toolbar")

    }, backgroundColor = Color.Red, contentColor = Color.White,
        navigationIcon = {
            IconButton(onClick = {
                onClickDrawer()
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "back")
            }

        }, actions = {
            IconButton(onClick = {
                onClick("Search")
            }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
            }

            IconButton(onClick = {
                onClick("Add")
            }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "add")
            }
        })
}