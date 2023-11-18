package com.example.instaclone.view.profile


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instaclone.ui.theme.InstaCloneTheme

@Composable
fun ProfileScreen() {
    Box(Modifier.background(MaterialTheme.colorScheme.background)) {
        Column {
            InstaToolbarProfile()
            ProfileData()
        }



    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenpreview() {
    ProfileScreen()
}

@Preview(showBackground = true)
@Composable
fun HomeScreenpreviewDark() {
    InstaCloneTheme(darkTheme = true) {
        ProfileScreen()
    }

}
