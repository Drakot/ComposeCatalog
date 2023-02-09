package com.dralsoft.composecatalogo

sealed class Route(val route: String) {
    object Pantalla1 : Route("pantalla1")
    object Pantalla2 : Route("pantalla2")
    object Pantalla3 : Route("pantalla3")
    object Pantalla4 : Route("pantalla4/{age}") {
        fun createRoute(age: Int) = "pantalla4/$age"
    }
}