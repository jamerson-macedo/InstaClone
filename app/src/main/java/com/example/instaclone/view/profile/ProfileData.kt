package com.example.instaclone.view.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclone.R
import com.example.instaclone.data.repository.stories
import com.example.instaclone.ui.theme.InstaCloneTheme
import com.example.instaclone.ui.theme.gray_text
import com.example.instaclone.ui.theme.spacingMedium
import com.example.instaclone.ui.theme.spacingSmall
import com.example.instaclone.view.home.InstaToolbar

@Composable
fun ProfileData() {
    val instalabel = stringResource(id = R.string.insta_label)
    val iconscolor = MaterialTheme.colorScheme.onBackground
// box nao precisa do maxwidth ja fica do tamanho
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
    ) {
        Row( // como se fosse uma linha
            modifier = Modifier
                .padding(horizontal = spacingMedium)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_message),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
            )
            Row() {
                Column(
                    Modifier.padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "1",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Publicações",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )


                }
                Column(
                    Modifier.padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "1",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Seguidores",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )


                }

                Column(
                    Modifier.padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "1",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Seguindo",
                        Modifier
                            .padding(start = 12.dp)
                            .padding(top = spacingSmall),
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )


                }
            }

        }
        Column {
            Text(
                text = "Jamerson Macedo",
                Modifier
                    .padding(start = 12.dp)
                    .padding(top = spacingSmall),
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Dev mobile",
                Modifier
                    .padding(start = 12.dp)
                    .padding(top = spacingSmall),
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
        Row {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = gray_text),
                modifier = Modifier.padding(start = 10.dp, end = 5.dp),
            ) {
                Text(text = "Editar Perfil")

            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = gray_text)
            ) {
                Text(text = "Compartilhar perfil")

            }
        }
        Row {
            destaqueItem(story = stories[0])
        }


    }

}

@Preview(showBackground = true)
@Composable
fun instaprofilepreview() {
    ProfileData()
}

@Preview(showBackground = true)
@Composable
fun instaprofilepreviewdark() {
    InstaCloneTheme(darkTheme = true) {
        InstaToolbar()
    }

}