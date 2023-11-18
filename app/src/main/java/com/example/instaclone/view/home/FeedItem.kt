package com.example.instaclone.view.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.instaclone.R
import com.example.instaclone.data.model.Feed
import com.example.instaclone.data.repository.feedList
import com.example.instaclone.ui.theme.InstaCloneTheme
import com.example.instaclone.ui.theme.gray
import com.example.instaclone.ui.theme.spacingLarge
import com.example.instaclone.ui.theme.spacingMedium
import com.example.instaclone.ui.theme.spacingSmall
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FeedItem(feed: Feed) {
    val likeIcon = R.drawable.ic_notification
    val messageIcon = R.drawable.ic_message
    val comentIcon = R.drawable.ic_comment
    val bookmarkIcon = R.drawable.ic_bookmark
    val iconscolor = MaterialTheme.colorScheme.onBackground
    val likedIcon = R.drawable.ic_liked
    // boleano
    var isLiked by rememberSaveable { mutableStateOf(false) }

    val iconsColor = MaterialTheme.colorScheme.onBackground
    val likedColor = if (isLiked) Color.Red else iconsColor

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
            model = feed.imageUrl,
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

            feedIcon(icon = if (isLiked) likedIcon else likeIcon, color = likedColor) {
                isLiked=!isLiked
            }
            feedIcon(icon = comentIcon, color = iconscolor){}
            feedIcon(icon = messageIcon, color = iconscolor){}

            Image(
                painter = painterResource(id = bookmarkIcon),
                contentDescription = "",
                Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
                    .weight(1f)
                    .wrapContentWidth(Alignment.End),
                colorFilter = ColorFilter.tint(iconscolor)
            )

        }
        Row(
            Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
        ) {
            // estudar isso annotated string
            val description = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {

                    append(feed.nickname)
                }
                append(" ")
                append(feed.description)

            }
            Text(
                text = description,
                Modifier.padding(horizontal = spacingMedium),
                overflow = TextOverflow.Ellipsis, textAlign = TextAlign.Start
            )
        }
        Text(
            text = feed.postedAgo,
            Modifier
                .padding(start = 12.dp)
                .padding(top = spacingSmall),
            maxLines = 1,
            color = gray,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Start
        )

    }


}

@Composable
fun feedIcon(
    @DrawableRes icon: Int,
    color: Color,
    onClick: () -> Unit
) {
    Image(
        painter = painterResource(id = icon),
        contentDescription = "",
        Modifier
            .size(40.dp)
            .padding(end = spacingLarge)
            .clickable { onClick() },
        colorFilter = ColorFilter.tint(color)
    )

}

@Preview(showBackground = true)
@Composable
fun feedpreview() {

    FeedItem(
        feed = feedList[0]
    )
}

@Preview(showBackground = true)
@Composable
fun feedpreviewDark() {
    InstaCloneTheme(darkTheme = true) {
        FeedItem(
            feed = feedList[0]
        )


    }

}