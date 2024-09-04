package com.ifsha.ahterassignment.screens.primary_menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ifsha.ahterassignment.MainRoute
import com.ifsha.ahterassignment.components.SubMenu
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun LocationMenu(
    navController: NavController
) {
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
        ),
        onSelectionChanged = { index ->
            when (index) {
                0 -> navController.navigate(MainRoute.HOME_LOCATION_ROUTE)
                1 -> navController.navigate(MainRoute.FRIEND_LOCATION_ROUTE)
                2 -> navController.navigate(MainRoute.OFFICE_LOCATION_ROUTE)
            }
        }
    )
}