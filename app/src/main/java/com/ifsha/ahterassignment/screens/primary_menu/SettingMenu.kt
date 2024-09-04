package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ifsha.ahterassignment.MainRoute
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun SettingMenu(
    navController: NavController
) {
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
        ),
        onSelectionChanged = { index ->
            when (index) {
                0 -> navController.navigate(MainRoute.SETTING_1_ROUTE)
                1 -> navController.navigate(MainRoute.SETTING_2_ROUTE)
                2 -> navController.navigate(MainRoute.SETTING_3_ROUTE)
                3 -> navController.navigate(MainRoute.SETTING_4_ROUTE)
            }
        }
    )
}