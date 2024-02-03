package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aayushi.demo.R
import com.aayushi.demo.ui.theme.green

@Composable
fun Matches() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Live Screen", "For You", "Upcoming", "Finished")

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = green,
            contentColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                //.horizontalScroll(rememberScrollState())
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = {
                        selectedTabIndex = index
                    },
                    text = { Text(title) }
                )
            }
        }

        when (selectedTabIndex) {
            0 -> LiveScreen()
            1 -> ForYouScreen()
            2 -> UpcomingScreen()
            3 -> FinishedScreen()
        }
    }
}

@Composable
fun LiveScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
                    .padding(start = 8.dp, end = 16.dp)
            )
        }

        items(7) { index ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_7),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                )


                Text(
                    text = "Item $index",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .weight(1f)
                )


                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24),
                    contentDescription = "Drawable",
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 16.dp)
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


            Spacer(modifier = Modifier.height(8.dp))

        }
    }
}

@Composable
fun ForYouScreen() {
    Text(text = "For You Content", modifier = Modifier.padding(16.dp))
}

@Composable
fun UpcomingScreen() {
    Text(text = "Upcoming Content", modifier = Modifier.padding(16.dp))
}

@Composable
fun FinishedScreen() {
    Text(text = "Finished Content", modifier = Modifier.padding(16.dp))
}



