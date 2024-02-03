package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
    Text(text = "Live Screen Content", modifier = Modifier.padding(16.dp))
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



