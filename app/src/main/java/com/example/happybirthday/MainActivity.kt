package com.example.happybirthday

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(businessName = "Creative Cakes!", business2 = "Cake Baking!", name = "Annelise Blanchard", email = "annelise@gmail.com", phone = "425-218-7414", city = "Seattle")                }
            }
        }
    }
}

@Composable
fun GreetingText(businessName: String, business2: String , name: String, email: String, phone: String, city: String, modifier: Modifier = Modifier) {

    Column(modifier = Modifier
            .padding(2.dp)
            ){
        Row(modifier = Modifier
            .padding(8.dp)
        ){
            Text(
                text = businessName,
                fontSize = 16.sp,
                color = androidx.compose.ui.graphics.Color.Magenta,
                modifier = Modifier
                    .align(alignment = Alignment.Bottom)
                    .padding(4.dp)
            )
            Text(
                text = business2,
                fontSize = 10.sp,
                color = androidx.compose.ui.graphics.Color.Green
            )
        }
        Row(modifier = Modifier
            .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.headshot_image),
                contentDescription = stringResource(R.string.headshot),
                modifier = Modifier
                    .padding(4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.cake_image),
                contentDescription = stringResource(R.string.cake),
                modifier = Modifier
                    .padding(4.dp)
            )
        }
        Text(
            text = name,
            fontSize = 16.sp,
            lineHeight = 4.sp,
            color = androidx.compose.ui.graphics.Color.Blue,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(8.dp)

        )
        Text(
            text = email,
            fontSize = 12.sp,
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(4.dp)
        )
        Text(
            text = phone,
            fontSize = 12.sp,
            lineHeight = 4.sp,
            color = androidx.compose.ui.graphics.Color.DarkGray,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(4.dp)
        )
        Text(
            text = city,
            fontSize = 12.sp,
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(4.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    HappyBirthdayTheme {
            GreetingText(businessName = "Creative Cakes!", business2 = "Cake Baking!", name = "Annelise Blanchard", email = "annelise@gmail.com", phone = "425-218-7414", city = "Seattle")
        }
}