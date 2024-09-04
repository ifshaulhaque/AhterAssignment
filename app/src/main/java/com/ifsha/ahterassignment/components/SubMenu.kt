package com.ifsha.ahterassignment.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifsha.ahterassignment.R
import com.ifsha.ahterassignment.components.models.OptionItem

@Composable
fun SubMenu(
    heading: String,
    menuList: List<OptionItem>
) {
    var currentSelectedIndex by remember {
        mutableStateOf(0)
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .background(
                color = colorResource(id = R.color.blue_gray),
                shape = RoundedCornerShape(8.dp)
            )
            .width(200.dp)
            .fillMaxHeight()
            .padding(24.dp)
    ) {
        Text(
            text = heading,
            color = Color.White,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )

        for (i in 0 until menuList.size) {
            val menuItem = menuList[i]
            menuItem.action = {
                currentSelectedIndex = i
            }
            SubMenuItem(
                optionItem = menuItem,
                isSelected = i == currentSelectedIndex
            )
        }
    }
}

@Composable
@Preview
fun SubMenuPreview() {
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