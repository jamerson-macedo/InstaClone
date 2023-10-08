package com.example.instaclone.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.instaclone.R
import com.example.instaclone.data.model.Feed
import com.example.instaclone.ui.theme.spacingLarge
import com.example.instaclone.ui.theme.spacingMedium
import com.example.instaclone.ui.theme.spacingSmall
import com.example.instaclone.ui.theme.storyColor

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FeedItem(feed: Feed) {
    val likeIcon = R.drawable.ic_notification
    val messageIcon = R.drawable.ic_message
    val comentIcon = R.drawable.ic_comment
    val bookmarkIcon = R.drawable.ic_bookmark

    Column(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Row(
            modifier = Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
                .padding(start = 10.dp)
        ) {
            GlideImage(
                model = feed.useravatar,
                "",
                Modifier
                    .size(36.dp)
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )


            Column() {
                Text(
                    text = feed.nickname,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = feed.localname,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )


            }

        }
        GlideImage(
            model = feed.imageurl,
            "",
            Modifier
                .padding(top = spacingLarge)
                .height(256.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(start = spacingMedium)
                .padding(top = spacingLarge)

        ) {
            Image(
                painter = painterResource(id = likeIcon),
                contentDescription = "",
                Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge))
            Image(
                painter = painterResource(id = comentIcon),
                contentDescription = "",
                Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge))
            Image(
                painter = painterResource(id = messageIcon),
                contentDescription = "",
                Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge))
            Image(
                painter = painterResource(id = bookmarkIcon),
                contentDescription = "",
                Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
                    .weight(1f)
                    .wrapContentWidth(Alignment.End)
            )

        }


    }


}

@Preview(showBackground = true)
@Composable
fun feedpreview() {

    FeedItem(
        feed = Feed(
            "jamerson_macedo",
            "carnauba dos dantas",
            "",
            "",
            "ola mundo",
            "há 2 dias"
        )
    )
}