package com.ifsha.ahterassignment

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ifsha.ahterassignment.screens.primary_menu.BluetoothMenu
import com.ifsha.ahterassignment.screens.primary_menu.LocationMenu
import com.ifsha.ahterassignment.screens.primary_menu.SettingMenu

@Composable
fun PrimaryMenuNavGraph(
    mainNavController: NavHostController,
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = PrimaryMenuRoute.BLANK
    ) {
        composable(
            route = PrimaryMenuRoute.BLANK
        ) {

        }

        composable(
            route = PrimaryMenuRoute.LOCATION_ROUTE
        ) {
            LocationMenu(mainNavController)
        }

        composable(
            route = PrimaryMenuRoute.BLUETOOTH_ROUTE
        ) {
            BluetoothMenu(mainNavController)
        }

        composable(
            route = PrimaryMenuRoute.SETTING_ROUTE
        ) {
            SettingMenu(mainNavController)
        }
    }
}