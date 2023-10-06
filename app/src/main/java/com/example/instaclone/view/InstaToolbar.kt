package com.example.instaclone.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaclone.R

@Composable
fun InstaToolbar() {
    // como se fosse uma linha
    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .height(56.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Instagram", fontSize = 32.sp, modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
                .align(Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.ic_notification),
            contentDescription = "icone de notificacao"
        )
        Image(
            modifier = Modifier
                .size(32.dp)
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.ic_message),
            contentDescription = "messagem"
        )

    }
}


@Preview(showBackground = true)
@Composable
fun instatoolbarpreview() {
    InstaToolbar()
}