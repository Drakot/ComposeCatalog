package com.dralsoft.composecatalogo.ui.components

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.dralsoft.composecatalogo.MyBottomNavigation
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldView() {
    val state = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            MyTopAppBar {
                coroutineScope.launch {
                    state.snackbarHostState.showSnackbar(it)
                }
            }
        }, scaffoldState = state,
        bottomBar = {
            MyBottomNavigation()
        },
        floatingActionButton = {
            MyFab()
        }, floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
    }
}

@Composable
fun MyTopAppBar(onClick: (String) -> Unit) {
    TopAppBar(title = {
        Text(text = "Mi primera toolbar")

    }, backgroundColor = Color.Red, contentColor = Color.White,
        navigationIcon = {
            IconButton(onClick = {
                onClick("Atras")
            }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "back")
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