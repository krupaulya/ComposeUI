package com.example.composeui

sealed class Screens(val route: String) {
    object Flags : Screens(route = "home_screen")
    object Austria : Screens(route = "austria_screen")
    object Colombia : Screens(route = "colombia_screen")
    object Denmark : Screens(route = "denmark_screen")
    object Italy : Screens(route = "italy_screen")
    object Madagascar : Screens(route = "madagascar_screen")
    object Poland : Screens(route = "poland_screen")
    object Switzerland : Screens(route = "switzerland_screen")
    object Thailand : Screens(route = "thailand_screen")
}
