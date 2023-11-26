package com.example.composeui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Flags.route
    ) {
        composable(
            route = Screens.Flags.route
        ) {
            Flags(navController)
        }
        composable(
            route = Screens.Austria.route
        ) {
            Austria()
        }
        composable(
            route = Screens.Colombia.route
        ) {
            Colombia()
        }
        composable(
            route = Screens.Denmark.route
        ) {
            Denmark()
        }
        composable(
            route = Screens.Italy.route
        ) {
            Italy()
        }
        composable(
            route = Screens.Madagascar.route
        ) {
            Madagascar()
        }
        composable(
            route = Screens.Poland.route
        ) {
            Poland()
        }
        composable(
            route = Screens.Switzerland.route
        ) {
            Switzerland()
        }
        composable(
            route = Screens.Thailand.route
        ) {
            Thailand()
        }
    }
}