package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aayushi.demo.R
import com.aayushi.demo.ui.theme.green

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Text information on the left
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(text = "Atsushi", fontSize = 16.sp)
                Text(text = "Atsushi@gmail.com", fontSize = 16.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "Big Elephant",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)

            )
        }
    }

}