package com.example.latihanweather

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.latihanweather.ui.theme.LatihanweatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanweatherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "FahriAPP",
            fontSize = 35.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        location()
        BoxBottom()
        Spacer(modifier = Modifier.padding(20.dp))
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Yellow))
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.rainstatus),
                contentDescription = "",
                modifier = Modifier.size(200.dp)
            )
            Text(text = "Sunny", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun location(){
    Text(
        text = "28° C",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold)
    Row() {
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "BSD", fontSize = 60.sp)

    }
    Spacer(modifier = Modifier.padding(5.dp))

    Text(
        text = "BSD, Kota Tangerang Selatan",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Gray)
}


@Composable
fun Greeting(name: String) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatihanweatherTheme {
        Greeting("")
    }
    Home()
}

@Composable
fun BoxBottom() {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(color = Color.Yellow)

    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "Humidity")
                    Text(text = "70%", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "UV Index")
                    Text(text = "9 / 10", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "Sunrise")
                    Text(text = "06.00 AM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "Sunset")
                    Text(text = "05.20 PM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
            }

        }
    }
}