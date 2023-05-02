package com.example.variablefontssample.ui.theme

import android.os.Build
import androidx.compose.material3.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.unit.sp
import com.example.variablefontssample.R

@OptIn(ExperimentalTextApi::class)
val DisplayLargeFontFamily = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    FontFamily(
        Font(
            R.font.robotoflex_variable, variationSettings = FontVariation.Settings(
                FontVariation.weight(DisplayLargeVFConfig.WEIGHT),
                FontVariation.width(DisplayLargeVFConfig.WIDTH),
                FontVariation.slant(DisplayLargeVFConfig.SLANT),
                ascenderHeight(DisplayLargeVFConfig.ASCENDER_HEIGHT),
            )
        )
    )
} else {
    FontFamily(
        Font(
            R.font.robotoflex_static_regular
        )
    )
}

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = DisplayLargeFontFamily,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp
    ),
)
