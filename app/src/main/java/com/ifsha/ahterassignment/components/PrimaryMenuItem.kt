package com.ifsha.ahterassignment.components

import com.ifsha.ahterassignment.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ifsha.ahterassignment.components.models.MenuItem

@Composable
fun PrimaryMenuItem(
    menuItem: MenuItem,
    isSelected: Boolean = false,
) {
    Box(
        modifier = Modifier
            .background(
                color = if (isSelected) Color.White else Color.DarkGray,
                shape = CircleShape
            )
            .clickable { menuItem.action.invoke() }
            .padding(12.dp)
    ) {
        Icon(
            painter = painterResource(id = menuItem.icon),
            contentDescription = "primaryMenuIcon",
            tint = if (isSelected) Color.DarkGray else Color.White,
            modifier = Modifier.size(50.dp)
        )
    }
}

@Composable
@Preview
fun PrimaryMenuItemPreview() {
    PrimaryMenuItem(
        MenuItem(icon = R.drawable.baseline_location_on_24),
        isSelected = true
    )
}