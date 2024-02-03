package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.layout.*
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.aayushi.demo.screen.tab.DaysScreen
import com.aayushi.demo.ui.theme.green

@Composable
fun Fixtures() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Days Screen", "Series", "My Matches")

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = green,
            contentColor = androidx.compose.ui.graphics.Color.White,
            modifier = Modifier.fillMaxWidth().height(48.dp)
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

        // Display content based on the selected tab
        when (selectedTabIndex) {
            0 -> DaysScreen()
            1 -> SeriesScreen()
            2 -> MyMatchesScreen()
        }
    }
}



@Composable
fun SeriesScreen() {
    Text(text = "Series Content", fontSize = 20.sp)
}

@Composable
fun MyMatchesScreen() {
    Text(text = "My Matches Content", fontSize = 20.sp)
}
