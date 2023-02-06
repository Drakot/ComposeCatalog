package com.dralsoft.composecatalogo.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dralsoft.composecatalogo.MyBottomNavigation
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldView() {
    val state = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            MyTopAppBar(onClick = {
                coroutineScope.launch {
                    state.snackbarHostState.showSnackbar(it)
                }
            }, onClickDrawer = {
                coroutineScope.launch {
                    state.drawerState.open()
                }
            })
        }, scaffoldState = state,
        bottomBar = {
            MyBottomNavigation()
        },
        floatingActionButton = {
            MyFab()
        }, floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = false,
        drawerContent = {
            MyDrawer {
                coroutineScope.launch {
                    state.drawerState.close()
                }
            }
        }
    ) {
    }
}

@Composable
fun MyDrawer(onClose: () -> Unit) {
    Column(Modifier.padding(8.dp)) {
        Text(
            text = "Item 1", modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .clickable {
                    onClose()
                }
        )
        Text(
            text = "Item 2", modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .clickable {
                    onClose()
                }
        )
        Text(
            text = "Item 3", modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .clickable {
                    onClose()
                }
        )
        Text(
            text = "Item 4", modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .clickable {
                    onClose()
                }
        )
    }
}

