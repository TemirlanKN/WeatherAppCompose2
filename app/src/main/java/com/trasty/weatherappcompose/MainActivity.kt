package com.trasty.weatherappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trasty.weatherappcompose.screens.Example
import com.trasty.weatherappcompose.screens.ImageBox
import com.trasty.weatherappcompose.screens.MainScreen
import com.trasty.weatherappcompose.screens.fontMy
import com.trasty.weatherappcompose.ui.theme.WeatherAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                val painter = painterResource(id = R.drawable.meme)
                val description = "Stonks"
                val title = "Stonks"
//                MainScreen()
//                Example()
                fontMy()
                /*Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {
                    ImageBox(painter = painter, contentDescription = description, title = title)
                }*/
            }
        }
    }
}