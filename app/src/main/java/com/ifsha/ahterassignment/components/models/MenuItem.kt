package com.ifsha.ahterassignment.components.models

data class MenuItem(
    val icon: Int,
    var action: () -> Unit = {}
)