package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aayushi.demo.R

@Composable
fun ENGvsIND() {


    Column(
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            LazyRow(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.TopCenter)
            ) {
                items(10) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                }
            }

        }

    }
}

