package com.example.instaclone.view


import androidx.compose.foundation.background

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclone.data.model.Feed
import com.example.instaclone.data.model.Story
import com.example.instaclone.data.repository.stories
import com.example.instaclone.ui.theme.dividerColor
import com.example.instaclone.ui.theme.spacingMedium
import com.example.instaclone.data.repository.feedList
import com.example.instaclone.ui.theme.InstaCloneTheme

@Composable
fun HomeScreen() {
// como se fosse o linear layout
    // fill max size deixa do tamanho da tela
    // deixando compativel com o modo escuro
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
    ) {
        item { InstaToolbar() }
        item { storyList(story = stories) }
        item { Divider(color = MaterialTheme.colorScheme.onSurface, thickness = 0.2.dp) }
        feedlist(feed = feedList)

    }
}

@Composable
fun storyList(story: List<Story>) {
    LazyRow(modifier = Modifier.padding(top = spacingMedium)) {
        // funciona como se fosse um adapter
        // o item do story
        itemsIndexed(story) { _, item ->
            storyItem(story = item)

        }


    }

}

fun LazyListScope.feedlist(feed: List<Feed>) {

    itemsIndexed(feed) { _, item ->
        FeedItem(feed = item)
    }


}


@Preview(showBackground = true)
@Composable
fun HomeScreenpreview() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun HomeScreenpreviewDark() {
    InstaCloneTheme(darkTheme = true) {
        HomeScreen()
    }

}
