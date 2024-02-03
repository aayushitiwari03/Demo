package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aayushi.demo.R
import com.aayushi.demo.screen.tab.*
import com.aayushi.demo.ui.theme.green

@Composable
fun ENGvsIND() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
//            LazyRow(
//                modifier = Modifier
//                    .padding(8.dp)
//                    .align(Alignment.TopCenter)
//            ) {
//                items(10) {
//                    Image(
//                        painter = painterResource(id = R.drawable.img),
//                        contentDescription = null,
//                        modifier = Modifier.size(100.dp)
//                    )
//                }
//            }

            TabRow(
                selectedTabIndex = selectedTabIndex,
                backgroundColor = green,
                contentColor = Color.White,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .height(50.dp)
                    .fillMaxWidth()
                    //.horizontalScroll(rememberLazyListState()) // Use rememberLazyListState() for horizontal scroll
            ) {
                Tab(
                    selected = selectedTabIndex == 0,
                    onClick = {
                        selectedTabIndex = 0
                    },
                    text = { Text("OverView") }
                )
                Tab(
                    selected = selectedTabIndex == 1,
                    onClick = {
                        selectedTabIndex = 1
                    },
                    text = { Text("Matches") }
                )
                Tab(
                    selected = selectedTabIndex == 2,
                    onClick = {
                        selectedTabIndex = 2
                    },
                    text = { Text("Teams") }
                )
                Tab(
                    selected = selectedTabIndex == 3,
                    onClick = {
                        selectedTabIndex = 3
                    },
                    text = { Text("Series State") }
                )
                Tab(
                    selected = selectedTabIndex == 4,
                    onClick = {
                        selectedTabIndex = 4
                    },
                    text = { Text("News") }
                )
                Tab(
                    selected = selectedTabIndex == 5,
                    onClick = {
                        selectedTabIndex = 5
                    },
                    text = { Text("Info") }
                )
            }
        }

        when (selectedTabIndex) {
            0 -> OverView()
            1 -> Matche()
            2 -> Teams()
            3 -> SeriesStateScreen()
            4 -> NewsScreen()
            5 -> InfoScreen()
        }
    }
}

