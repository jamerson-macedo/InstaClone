package com.example.instaclone.view.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclone.R
import com.example.instaclone.ui.theme.InstaCloneTheme
import com.example.instaclone.ui.theme.spacingMedium
import com.example.instaclone.view.home.InstaToolbar

@Composable
fun InstaToolbarProfile() {
    val instalabel = stringResource(id = R.string.insta_label)
    val iconscolor = MaterialTheme.colorScheme.onBackground
// box nao precisa do maxwidth ja fica do tamanho
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Row( // como se fosse uma linha
            modifier = Modifier
                .padding(horizontal = spacingMedium)
                .height(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = instalabel,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp),
                style = MaterialTheme.typography.headlineLarge
            )
            Icon(
                imageVector = Icons.Rounded.Add, contentDescription = null, modifier = Modifier
                    .size(35.dp)
                    .padding(end = spacingMedium)
            )

            Icon(
                imageVector = Icons.Rounded.Menu, contentDescription = null, modifier = Modifier
                    .size(35.dp)
                    .padding(end = spacingMedium)
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun instatoolbarpreview() {
    InstaToolbarProfile()
}

@Preview(showBackground = true)
@Composable
fun instatoolbarpreviewdark() {
    InstaCloneTheme(darkTheme = true) {
        InstaToolbar()
    }

}