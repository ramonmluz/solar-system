package br.com.android.learning.solarsystemapp.ui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.android.learning.solarsystemapp.R
import br.com.android.learning.solarsystemapp.ui.theme.SolarSystemAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolarSystemAppTheme {
                HomeBackground()
            }
        }
    }
}

@Composable
fun HomeBackground() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        Image(
            painter = painterResource(id = R.drawable.background_solar_system),
            contentDescription = stringResource(id = R.string.background_solar_system_description),
            contentScale = ContentScale.Crop,
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun DefaultPreview() {
    SolarSystemAppTheme {
        HomeBackground()
    }
}