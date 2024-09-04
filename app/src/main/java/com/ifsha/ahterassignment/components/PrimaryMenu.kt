package com.ifsha.ahterassignment.components

import androidx.compose.foundation.background
import com.ifsha.ahterassignment.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ifsha.ahterassignment.components.models.MenuItem

@Composable
fun PrimaryMenu(
    menuList: List<MenuItem>,
    onSelectionChanged: (Int) -> Unit = {}
) {
    var currentSelectedIndex by remember {
        mutableStateOf(-1)
    }

    Column(
        modifier = Modifier
            .background(
                color = Color.DarkGray,
                shape = RoundedCornerShape(percent = 50)
            )
    ) {
        for (i in 0 until menuList.size) {
            val menuItem = menuList[i]
            menuItem.action = {
                currentSelectedIndex = i
                onSelectionChanged.invoke(i)
            }
            PrimaryMenuItem(
                menuItem = menuItem,
                isSelected = i == currentSelectedIndex
            )
        }
    }
}

@Composable
@Preview
fun PrimaryMenuPreview() {
    PrimaryMenu(
        listOf(
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