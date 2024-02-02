package com.aayushi.demo.screen.bottomNav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Fixtures() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = " Fixtures Screen", fontSize = 20.sp)
    }
}
