package com.dralsoft.composecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
            val navigation = rememberNavController()

            NavHost(navController = navigation, startDestination = Route.Pantalla1.route) {
                composable(Route.Pantalla1.route) { Screen1(navigation) }
                composable(Route.Pantalla2.route) { Screen2(navigation) }
                composable(Route.Pantalla3.route) { Screen3(navigation) }
                composable(Route.Pantalla4.route, arguments = listOf(
                    navArgument("age") { type = NavType.IntType }
                )) { navData ->
                    Screen4(
                        navigation,
                        navData.arguments?.getInt("age") ?: 0
                    )
                }

                composable(Route.Pantalla5.route, arguments = listOf(
                    navArgument("name") { type = NavType.StringType; defaultValue ="" }
                )) { navData ->
                    Screen5(
                        navigation,
                        navData.arguments?.getString("name")
                    )
                }
            }
        }
    }
}