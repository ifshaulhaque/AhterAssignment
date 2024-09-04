package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ifsha.ahterassignment.MainRoute
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun BluetoothMenu(
    navController: NavController
) {
    SubMenu(
        heading = "Bluetooth Devices",
        menuList = listOf(
            OptionItem(
                text = "Device 1"
            ),
            OptionItem(
                text = "Device 2"
            ),
            OptionItem(
                text = "Device 3"
            )
        ),
        onSelectionChanged = { index ->
            when (index) {
                0 -> navController.navigate(MainRoute.DEVICE_1_ROUTE)
                1 -> navController.navigate(MainRoute.DEVICE_2_ROUTE)
                2 -> navController.navigate(MainRoute.DEVICE_3_ROUTE)
            }
        }
    )
}