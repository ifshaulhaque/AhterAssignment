package com.ifsha.ahterassignment.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun SubMenuItem(
    optionItem: OptionItem,
    isSelected: Boolean = false,
) {
    Box(
        modifier = Modifier
            .background(
                color = if (isSelected) Color.White else Color.DarkGray,
                shape = RoundedCornerShape(percent = 50)
            )
            .onFocusChanged { state ->
                if (state.isFocused) optionItem.action.invoke()
            }
            .clickable { optionItem.action.invoke() }
            .padding(vertical = 12.dp, horizontal = 24.dp)
    ) {
        Text(
            text = optionItem.text,
            color = if (isSelected) Color.DarkGray else Color.White,
            fontSize = 24.sp
        )
    }
}

@Composable
@Preview
fun SubMenuItemPreview() {
    SubMenuItem(
        OptionItem(
            text = "Home"
        )
    )
}