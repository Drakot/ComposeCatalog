package com.dralsoft.composecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dralsoft.composecatalogo.ui.components.ScaffoldView
import com.dralsoft.composecatalogo.ui.components.SuperHeroStickyView
import com.dralsoft.composecatalogo.ui.components.SuperHeroWithControlsView
import com.dralsoft.composecatalogo.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    ComposeCatalogoTheme {
        Column() {
            ScaffoldView()
        }
    }
}