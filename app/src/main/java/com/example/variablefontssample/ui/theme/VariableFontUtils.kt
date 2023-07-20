package com.example.variablefontssample.ui.theme

import androidx.compose.ui.text.font.FontVariation

fun ascenderHeight(ascenderHeight: Float): FontVariation.Setting {
    require(ascenderHeight in 649f..854f) { "'Ascender Height' must be in 649f..854f" }
    return FontVariation.Setting("YTAS", ascenderHeight)
}

fun counterWidth(counterWidth: Int): FontVariation.Setting {
    require(counterWidth in 323..603) { "'Ascender Height' must be in 323..603" }
    return FontVariation.Setting("XTRA", counterWidth.toFloat())
}
