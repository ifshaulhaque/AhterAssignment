package com.ifsha.ahterassignment

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun PrimaryMenuNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = PrimaryMenuRoute.LOCATION_ROUTE
    ) {
        composable(
            route = PrimaryMenuRoute.LOCATION_ROUTE
        ) {

        }

        composable(
            route = PrimaryMenuRoute.BLUETOOTH_ROUTE
        ) {

        }

        composable(
            route = PrimaryMenuRoute.SETTING_ROUTE
        ) {

        }
    }
}