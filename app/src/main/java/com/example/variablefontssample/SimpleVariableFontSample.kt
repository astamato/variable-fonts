package com.example.variablefontssample

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.variablefontssample.ui.theme.VariableFontsSampleTheme


@Composable
@Preview
fun SimpleVariableFontSample() {
    VariableFontsSampleTheme {
        Text(
            text = "Whereas recognition of the inherent dignity",
            style = MaterialTheme.typography.displayLarge
        )
    }
}
