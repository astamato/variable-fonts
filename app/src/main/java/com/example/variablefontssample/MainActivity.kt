package com.example.variablefontssample

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.variablefontssample.ui.theme.VariableFontsSampleTheme
import com.example.variablefontssample.ui.theme.ascenderHeight

val Gradient = listOf(
    Color(0xff8BDEDA), Color(0xff43ADD0), Color(0xff998EE0), Color(0xffE17DC2), Color(0xffEF9393)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VariableFontsSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    VariableFontsDemo()
                }
            }
        }
    }
}


@OptIn(ExperimentalTextApi::class)
@Composable
@Preview
fun VariableFontsDemo() {
    var opticalSizing by remember { mutableStateOf(8f) }
    var weight by remember { mutableStateOf(400) }
    var width by remember { mutableStateOf(100f) }
    var slant by remember { mutableStateOf(0f) }
    var ascenderHeight by remember { mutableStateOf(750f) }
    var descenderDepth by remember { mutableStateOf(-203f) }
    var figureHeight by remember { mutableStateOf(738f) }
    var lowercaseHeight by remember { mutableStateOf(514f) }
    var uppercaseHeight by remember { mutableStateOf(712f) }

    var counterWidth by remember { mutableStateOf(468f) }
    var grade by remember { mutableStateOf(0f) }
    var thinStroke by remember { mutableStateOf(79f) }

    val message =
        "Question #12345678: What’s the recommended way to load async data and emit composable widgets?"
    val bubbleColor = Color(0xffE7E0EC)

    val scrollState = rememberScrollState()

    val fontFamily = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        FontFamily(
            Font(
                R.font.robotoflex_variable, variationSettings = FontVariation.Settings(
                    FontVariation.weight(weight),
                    FontVariation.width(width),
                    FontVariation.slant(slant),
//                    FontVariation.Setting("YTAS", ascenderHeight),
                    ascenderHeight(ascenderHeight),
                    FontVariation.Setting("YOPQ", thinStroke),
                    FontVariation.Setting("YTFI", figureHeight),
                    FontVariation.Setting("YTLC", lowercaseHeight),
                    FontVariation.Setting("YTUC", uppercaseHeight),
                    FontVariation.Setting("GRAD", grade),
                    FontVariation.Setting("YTDE", descenderDepth),
                    FontVariation.Setting("XTRA", counterWidth),
                    FontVariation.opticalSizing(TextUnit(opticalSizing, TextUnitType.Sp))
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

    Column {
        Text(
            modifier = Modifier
                .background(color = bubbleColor)
                .padding(16.dp),
            text = message,
            style = LocalTextStyle.current.merge(
                TextStyle(
//                    brush = Brush.linearGradient(
//                        colors = Gradient
//                    ),
                    fontSize = 20.sp
                )
            ),
            fontFamily = fontFamily
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            Modifier
                .padding(start = 32.dp, end = 32.dp)
                .verticalScroll(scrollState)
        ) {

//            Text("Optical size")
//            Slider(
//                value = opticalSizing,
//                onValueChange = { opticalSizing = it },
//                valueRange = 14f..144f
//            )

            Text("Weight")
            Slider(
                value = weight.toFloat(),
                onValueChange = { weight = it.toInt() },
                valueRange = 1f..1000f
            )

            Text("Slant")
            Slider(
                value = slant, onValueChange = { slant = it }, valueRange = -15f..0f
            )

            Text("Width")
            Slider(
                value = width, onValueChange = { width = it }, valueRange = 25f..151f
            )

            Text("Ascender Height")
            Slider(
                value = ascenderHeight,
                onValueChange = { ascenderHeight = it },
                valueRange = 649f..854f
            )
//            Text("Counter Width")
//            Slider(
//                value = counterWidth, onValueChange = { counterWidth = it }, valueRange = 323f..603f
//            )
            Text("Descender Depth")
            Slider(
                value = descenderDepth,
                onValueChange = { descenderDepth = it },
                valueRange = -305f..-98f
            )

//            Text("Grade")
//            Slider(
//                value = grade, onValueChange = { grade = it }, valueRange = -200f..150f
//            )

            Text("Figure Height")
            Slider(
                value = figureHeight, onValueChange = { figureHeight = it }, valueRange = 560f..788f
            )
            Text("Lowercase Height")
            Slider(
                value = lowercaseHeight,
                onValueChange = { lowercaseHeight = it },
                valueRange = 416f..570f
            )
            Text("Uppercase Height")
            Slider(
                value = uppercaseHeight,
                onValueChange = { uppercaseHeight = it },
                valueRange = 528f..760f
            )

//            Text("Thin Stroke")
//            Slider(
//                value = thinStroke, onValueChange = { thinStroke = it }, valueRange = 25f..135f
//            )
        }
    }
}
