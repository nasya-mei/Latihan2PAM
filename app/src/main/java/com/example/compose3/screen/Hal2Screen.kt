package com.example.compose3.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Hal2(onNavigateToHal1: () -> Unit){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Halaman 2")
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Pinartika Nasya Meilanty")
        Text(text = "245150401111026")
        Spacer(modifier = Modifier.size(10.dp))
        Button (onClick = onNavigateToHal1) { Text("BACK") }
    }
}