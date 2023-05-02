package com.example.variablefontssample.ui.theme

import androidx.compose.ui.text.font.FontVariation

fun ascenderHeight(ascenderHeight: Float): FontVariation.Setting {
    require(ascenderHeight in 649f..854f) { "'Ascender Height' must be in 649f..854f" }
    return FontVariation.Setting("YTAS", ascenderHeight)
}
