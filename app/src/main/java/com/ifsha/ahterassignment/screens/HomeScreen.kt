package com.ifsha.ahterassignment.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.ifsha.ahterassignment.MainNavGraph
import com.ifsha.ahterassignment.PrimaryMenuNavGraph
import com.ifsha.ahterassignment.PrimaryMenuRoute
import com.ifsha.ahterassignment.R
import com.ifsha.ahterassignment.components.PrimaryMenu
import com.ifsha.ahterassignment.components.models.MenuItem

@Composable
fun HomeScreen() {
    val primaryMenuNavController = rememberNavController()
    val mainNavController = rememberNavController()

    MainNavGraph(navHostController = mainNavController)

    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 8.dp)
        ) {
            PrimaryMenu(
                onSelectionChanged = { index ->
                    when (index) {
                        0 -> primaryMenuNavController.navigate(PrimaryMenuRoute.LOCATION_ROUTE)
                        1 -> primaryMenuNavController.navigate(PrimaryMenuRoute.BLUETOOTH_ROUTE)
                        2 -> primaryMenuNavController.navigate(PrimaryMenuRoute.SETTING_ROUTE)
                        else -> primaryMenuNavController.navigate(PrimaryMenuRoute.BLANK)
                    }
                },
                menuList = listOf(
                    MenuItem(
                        icon = R.drawable.baseline_location_on_24
                    ),
                    MenuItem(
                        icon = R.drawable.baseline_bluetooth_24
                    ),
                    MenuItem(
                        icon = R.drawable.baseline_settings_24
                    )
                )
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .fillMaxHeight(0.6f)
        ) {
            PrimaryMenuNavGraph(
                mainNavController = mainNavController,
                navHostController = primaryMenuNavController
            )
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}