package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aayushi.demo.R


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

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
                    .padding(start = 16.dp, end = 16.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Following",
                style = MaterialTheme.typography.body1,
            )

            Text(
                text = "See All",
                style = MaterialTheme.typography.body1,

            )
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            items(2) {
                Image(
                    painter = painterResource(id = R.drawable.img_7),
                    contentDescription = "Following",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .padding(2.dp)
                )
            }
        }

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
                    .padding(start = 16.dp, end = 16.dp)
            )
        }


        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.LightGray)
                        .padding(start = 16.dp, end = 16.dp)
                )
            }

            items(7) { index ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(45.dp)
                            .clip(CircleShape)
                    )


                    Text(
                        text = "Item $index",
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    )


                    Image(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        contentDescription = "Drawable",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 16.dp)
                    )
                }


                Spacer(modifier = Modifier.height(8.dp))

            }
        }



    }

}