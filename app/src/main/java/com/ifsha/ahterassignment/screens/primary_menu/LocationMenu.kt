package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun LocationMenu() {
    SubMenu(
        heading = "Saved Place",
        menuList = listOf(
            OptionItem(
                text = "House"
            ),
            OptionItem(
                text = "Friend"
            ),
            OptionItem(
                text = "Office"
            )
        )
    )
}