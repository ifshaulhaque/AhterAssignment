package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun BluetoothMenu() {
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
        )
    )
}