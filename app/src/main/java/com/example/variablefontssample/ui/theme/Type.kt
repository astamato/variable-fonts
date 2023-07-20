package com.example.variablefontssample.ui.theme

import android.os.Build
import androidx.compose.material3.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.variablefontssample.R

val default = FontFamily(
    /*
    * This can be any font that makes sense
    */
    Font(
        R.font.robotoflex_static_regular
    )
)

/**
 * Create a FontFamily to configure each param of your Typography
 */
@OptIn(ExperimentalTextApi::class)
val DisplayLargeFontFamily = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    FontFamily(
        Font(
            R.font.robotoflex_variable, variationSettings = FontVariation.Settings(
                FontVariation.weight(DisplayLargeVFConfig.WEIGHT),
                FontVariation.width(DisplayLargeVFConfig.WIDTH),
                FontVariation.slant(DisplayLargeVFConfig.SLANT),
                ascenderHeight(DisplayLargeVFConfig.ASCENDER_HEIGHT),
                counterWidth(DisplayLargeVFConfig.COUNTER_WIDTH)
            )
        )
    )
} else {
    default
}

@OptIn(ExperimentalTextApi::class)
val HeadlineMediumFontFamily = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    FontFamily(
        Font(
            R.font.robotoflex_variable, variationSettings = FontVariation.Settings(
                FontVariation.weight(HeadlineMediumVFConfig.WEIGHT),
                FontVariation.width(HeadlineMediumVFConfig.WIDTH),
                FontVariation.slant(HeadlineMediumVFConfig.SLANT),
                ascenderHeight(HeadlineMediumVFConfig.ASCENDER_HEIGHT),
                counterWidth(HeadlineMediumVFConfig.COUNTER_WIDTH)
            )
        )
    )
} else {
    default
}

@OptIn(ExperimentalTextApi::class)
val BodyLargeFontFamily = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    FontFamily(
        Font(
            R.font.robotoflex_variable, variationSettings = FontVariation.Settings(
                FontVariation.weight(BodyLargeVFConfig.WEIGHT),
                FontVariation.width(BodyLargeVFConfig.WIDTH),
                FontVariation.slant(BodyLargeVFConfig.SLANT),
                ascenderHeight(BodyLargeVFConfig.ASCENDER_HEIGHT),
                counterWidth(BodyLargeVFConfig.COUNTER_WIDTH)
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

/**
 * Configure the Typography for each param
 */
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = DisplayLargeFontFamily,
        fontSize = 50.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp,
        /***/
    ),
    headlineMedium = TextStyle(
        fontFamily = HeadlineMediumFontFamily,
        fontSize = 35.sp,
        lineHeight = 37.sp
        /***/
    ),
    bodyLarge = TextStyle(
        fontFamily = BodyLargeFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 28.sp,
        letterSpacing = 0.15.sp
        /***/
    ),
)
