package com.aayushi.demo.screen.tab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun OverView(){

    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
    ) {
        Text(text ="OverView Screen", fontSize = 20.sp)
    }

}