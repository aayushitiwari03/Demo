package com.aayushi.demo.screen.design


import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aayushi.demo.R
import com.aayushi.demo.model.HomeLazyColumItem
import com.aayushi.demo.model.HomeLazyRowItem
import com.aayushi.demo.ui.theme.green


@Composable
fun HomeScreenDesign() {
    Column(

    ) {
        Text(text = "Featured Matches", fontSize = 15.sp, modifier = Modifier.padding(8.dp))
        val data = listOf<HomeLazyRowItem>(
            HomeLazyRowItem("2nd Test, England tour of india 2024", "IND", "ENG", "Live", "Day 1:Session3"),
            HomeLazyRowItem("Only Match. Afghanistan tour of Sri Lanka 2024", "AFG", "SL", "Live", "Day 1:Session3"),
            HomeLazyRowItem("1st ODI, West Indies tour of Australia 2024", "WI ", "AUS", "Aus Won by 8 wickets", ""),
            HomeLazyRowItem("17th T20, BPL 2024", "SYS", "DD", "Live", "83 runs needed in 61 balls"),
            HomeLazyRowItem("18th T20, BPL 2024", "Comilla Victorians ", "Chattogram Challenges", "Starting In: hr:sec", ""),
            HomeLazyRowItem("27th T20, SA20 league 2024", "Pearl Royals", "Sunrisers Eastern Cape", "Today", "")
        )

        LazyRow(
//            modifier = Modifier.padding(8.dp)
//                .fillMaxSize()
//                .horizontalScroll(rememberScrollState())
        ) {
            items(data.size) { index ->
                HomeLazyRowItemDesign(data[index])
            }
        }

        val dataImage = listOf<HomeLazyColumItem>(
            HomeLazyColumItem("${R.drawable.img}"),
            HomeLazyColumItem("${R.drawable.img_1}"),
            HomeLazyColumItem("${R.drawable.img_2}"),
            HomeLazyColumItem("${R.drawable.img_3}"),
            HomeLazyColumItem("${R.drawable.img_4}"),
            HomeLazyColumItem("${R.drawable.img_5}"),

        )
        LazyColumn(
        )
        {
            items(dataImage.size) {index ->
                HomeLazyColumDesign(dataImage[index])
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
        Column {
            Text(text = list.matchInfo, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
            Text(text = list.team1, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
            Text(text = list.team2, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
            Text(text = list.stream, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
            Text(text = list.matchDay, fontSize = 15.sp, modifier = Modifier.padding(8.dp), color = Color.White)
        }
    }
}

@Composable
fun HomeLazyColumDesign(list : HomeLazyColumItem){
    Column(
        modifier = Modifier.padding(8.dp)
    ) {


    list.image?.let {
        Image(
            painter = painterResource(id = it.toInt()),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .width(360.dp)
        )
    }

}
}

