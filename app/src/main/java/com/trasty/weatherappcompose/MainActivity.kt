package com.trasty.weatherappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.trasty.weatherappcompose.screens.MainCard
import com.trasty.weatherappcompose.screens.TabLayout
import com.trasty.weatherappcompose.ui.theme.WeatherAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                val painter = painterResource(id = R.drawable.meme)
                val description = "Stonks"
                val title = "Stonks"

                Image(
                    painter = painterResource(id = R.drawable.sky),
                    contentDescription = "image_1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.FillBounds
                )
                Column{
                    MainCard()
                    TabLayout()
                }

//                Example()
//                fontMy()
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