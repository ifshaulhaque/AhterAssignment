package com.ifsha.ahterassignment

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ifsha.ahterassignment.components.ScreenWithText

@Composable
fun MainNavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = MainRoute.MAIN_ROUTE) {
        composable(
            route = MainRoute.MAIN_ROUTE
        ) {
            ScreenWithText(text = "Main Screen")
        }

        composable(
            route = MainRoute.HOME_LOCATION_ROUTE
        ) {
            ScreenWithText(text = "Home Location")
        }

        composable(
            route = MainRoute.FRIEND_LOCATION_ROUTE
        ) {
            ScreenWithText(text = "Friend Location")
        }

        composable(
            route = MainRoute.OFFICE_LOCATION_ROUTE
        ) {
            ScreenWithText(text = "Office Location")
        }

        composable(
            route = MainRoute.DEVICE_1_ROUTE
        ) {
            ScreenWithText(text = "Device 1")
        }

        composable(
            route = MainRoute.DEVICE_2_ROUTE
        ) {
            ScreenWithText(text = "Device 2")
        }

        composable(
            route = MainRoute.DEVICE_3_ROUTE
        ) {
            ScreenWithText(text = "Device 3")
        }

        composable(
            route = MainRoute.SETTING_1_ROUTE
        ) {
            ScreenWithText(text = "Setting 1")
        }

        composable(
            route = MainRoute.SETTING_2_ROUTE
        ) {
            ScreenWithText(text = "Setting 2")
        }

        composable(
            route = MainRoute.SETTING_3_ROUTE
        ) {
            ScreenWithText(text = "Setting 3")
        }

        composable(
            route = MainRoute.SETTING_4_ROUTE
        ) {
            ScreenWithText(text = "Setting 4")
        }
    }
}