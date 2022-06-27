package com.trasty.weatherappcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.trasty.weatherappcompose.R

@Composable
fun fontMy() {
    val fontFamily = FontFamily(
        Font(R.font.dosis_regular, FontWeight.Light),
        Font(R.font.dosis_bold, FontWeight.Bold),
        Font(R.font.dosis_medium, FontWeight.Medium),
        Font(R.font.dosis_extrabold, FontWeight.ExtraBold),
        Font(R.font.dosis_extralight, FontWeight.ExtraLight),
        Font(R.font.dosis_semibold, FontWeight.SemiBold)
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("J")
                }
                append("etpack")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")
            },
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.ExtraLight,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
}