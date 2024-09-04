package com.ifsha.ahterassignment.components.models

data class OptionItem(
    val text: String,
    var action: () -> Unit = {}
)
