package com.example.profilepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIBackground()
            Profile()

                Text(text = "your name",
                    fontSize = 50.sp,

                    modifier = Modifier
                        .offset(x=70.dp,y=250.dp)
                )
            Text(text = "yourname000@gmail.com",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,

                modifier = Modifier
                    .offset(x=95.dp,y=315.dp)
            )
            MyProfile {

            }
            MyDonations {

            }
            SettingsButton {

            }








        }
    }
}
@Composable
fun UIBackground(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.background), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize())
    }


}
@Composable
fun Profile(){
    Box {
        Image(painter = painterResource(id = R.drawable.profile), contentDescription = null,
            modifier = Modifier
                .offset(x = 100.dp, y = 100.dp)
                .size(170.dp)
                .clip(CircleShape))
    }

}
@Composable
fun MyProfile(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }, modifier = Modifier
            .offset(x=35.dp,y=350.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.iconamoon_profilefill), contentDescription = null ,
            modifier = Modifier.size(25.dp))
        Text("My Profile"
            , fontWeight = FontWeight.Bold
        , style = TextStyle(
            color = Color.Black
        )
        )

    }
}
@Composable
fun MyDonations(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }, modifier = Modifier
            .offset(x=35.dp,y=385.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.tdesign_money), contentDescription = null,
            modifier = Modifier.size(25.dp))
        Text("My Donations"
            , fontWeight = FontWeight.Bold
            , style = TextStyle(
                color = Color.Black
            )
        )
    }
}
@Composable
fun SettingsButton(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }, modifier = Modifier
            .offset(x=35.dp,y=435.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_sharpsettings), contentDescription = null,
            modifier = Modifier.size(25.dp))
        Text("Settings"
            , fontWeight = FontWeight.Bold
            , style = TextStyle(
                color = Color.Black
            )
        )
    }
}

