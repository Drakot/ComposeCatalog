package com.dralsoft.composecatalogo

data class CheckInfo(
    val title: String,
    val selected: Boolean,
    var onChecked: (Boolean) -> Unit
)