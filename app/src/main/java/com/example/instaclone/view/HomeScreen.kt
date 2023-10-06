package com.example.instaclone.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
// como se fosse o linear layout
    // fill max size deixa do tamanho da tela
    Column(modifier = Modifier.fillMaxSize()) {

        // como se fosse uma linha
        Row(modifier = Modifier.padding(horizontal = 10.dp)) {
            Text(text = "Instagram", fontSize =32.sp )


        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenpreview(){
    HomeScreen()
}