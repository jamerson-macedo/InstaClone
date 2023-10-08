package com.example.instaclone.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instaclone.data.model.Story
import com.example.instaclone.data.repository.stories
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

@Preview(showBackground = true)
@Composable
fun HomeScreenpreview() {
    HomeScreen()
}