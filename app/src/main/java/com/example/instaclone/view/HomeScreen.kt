package com.example.instaclone.view

import android.content.ClipData.Item
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclone.data.model.Feed
import com.example.instaclone.data.model.Story
import com.example.instaclone.data.repository.stories
import com.example.instaclone.ui.theme.dividerColor
import com.example.instaclone.ui.theme.spacingMedium

@Composable
fun HomeScreen() {
// como se fosse o linear layout
    // fill max size deixa do tamanho da tela
    // deixando compativel com o modo escuro
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        InstaToolbar()
        storyList(story = stories)
        Divider(color = dividerColor, thickness = 0.2.dp)
        feedList(feed = com.example.instaclone.data.repository.feedList)


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

@Composable
fun feedList(feed: List<Feed>) {
    LazyColumn(modifier = Modifier.padding(top = spacingMedium)) {
        // funciona como se fosse um adapter
        // o item do story
        // item(feed) { _, item ->
        itemsIndexed(feed) { _,item->
            FeedItem(feed = item)
        }


    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenpreview() {
    HomeScreen()
}