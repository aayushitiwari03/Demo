package com.aayushi.demo.screen.tab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aayushi.demo.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.aayushi.demo.model.HomeLazyRowItem
import com.aayushi.demo.ui.theme.green

@Composable
fun DaysScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
        ) {
            Button(
                onClick = { /* Handle All button click */ }, modifier = Modifier
                    .size(70.dp)
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = green)
            ) {
                Text("All", color = Color.White, modifier = Modifier.size(20.dp))
            }
            Button(onClick = { /* Handle Men button click */ }, modifier = Modifier
                .size(70.dp)
                .padding(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = green)) {
                Text("Men", color = Color.White,modifier = Modifier.size(5.dp))
            }
            Button(onClick = { /* Handle T20 button click */ }, modifier = Modifier
                .size(70.dp)
                .padding(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = green)) {
                Text("T20", color = Color.White,modifier = Modifier.size(5.dp))
            }
            Button(onClick = { /* Handle ODI button click */ }, modifier = Modifier
                .size(70.dp)
                .padding(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = green)) {
                Text("ODI", color = Color.White,modifier = Modifier.size(5.dp))
            }
            Image(
                painter = painterResource(id = R.drawable.baseline_filter_list_24),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
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

        val data = listOf<HomeLazyRowItem>(
            HomeLazyRowItem("2nd Test, England tour of india 2024", "IND", "ENG", "Live", "Day 1:Session3"),
            HomeLazyRowItem("Only Match. Afghanistan tour of Sri Lanka 2024", "AFG", "SL", "Live", "Day 1:Session3"),
            HomeLazyRowItem("1st ODI, West Indies tour of Australia 2024", "WI ", "AUS", "Aus Won by 8 wickets", ""),
            HomeLazyRowItem("17th T20, BPL 2024", "SYS", "DD", "Live", "83 runs needed in 61 balls"),
            HomeLazyRowItem("18th T20, BPL 2024", "Comilla Victorians ", "Chattogram Challenges", "Starting In: hr:sec", ""),
            HomeLazyRowItem("27th T20, SA20 league 2024", "Pearl Royals", "Sunrisers Eastern Cape", "Today", "")
        )

        LazyColumn(){
            items(data.size) { index ->
                HomeLazyRowItemDesign(data[index])
            }
        }


    }
}

@Composable
fun HomeLazyRowItemDesign(list: HomeLazyRowItem) {
    Card(
        backgroundColor = green,
        modifier = Modifier
            .padding(8.dp)
            .width(360.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = list.matchInfo, fontSize = 10.sp, modifier = Modifier.padding(4.dp), color = Color.LightGray)
                Text(text = list.team1, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
                Text(text = list.team2, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
                Text(text = list.matchDay, fontSize = 12.sp, modifier = Modifier.padding(8.dp), color = Color.Yellow)
            }
            Text(
                text = list.stream,
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(4.dp)
                    .align(Alignment.CenterVertically),
                color = Color.Red
            )
        }


    }
}
