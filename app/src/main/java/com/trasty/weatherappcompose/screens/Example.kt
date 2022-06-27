package com.trasty.weatherappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trasty.weatherappcompose.R

@Preview(showBackground = true)
@Composable
fun Example() {
    Image(
        painter = painterResource(id = R.drawable.sky),
        contentDescription = "background_image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(0.5f)
            .padding(50.dp)
            .border(width = 4.dp, color = Color.Cyan)
            .offset(x = 50.dp, y = 100.dp)
            .border(5.dp, Color.Yellow)
    ) {
        Text("Example")
        Text("Aida")
    }
}