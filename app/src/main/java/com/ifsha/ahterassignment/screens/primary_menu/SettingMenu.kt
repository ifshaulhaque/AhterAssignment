package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun SettingMenu() {
    SubMenu(
        heading = "Settings",
        menuList = listOf(
            OptionItem(
                text = "Option 1"
            ),
            OptionItem(
                text = "Option 2"
            ),
            OptionItem(
                text = "Option 3"
            ),
            OptionItem(
                text = "Option 4"
            )
        )
    )
}