package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aayushi.demo.R

@Composable
fun ENGvsIND() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyRow(
            modifier = Modifier.padding(8.dp)
        )
        {
            items(10) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription =null, modifier = Modifier.size(100.dp)
                )
            }
        }
    }

}