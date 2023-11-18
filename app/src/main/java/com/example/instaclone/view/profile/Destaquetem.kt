package com.example.instaclone.view.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.instaclone.data.model.Story
import com.example.instaclone.data.repository.stories
import com.example.instaclone.ui.theme.spacingSmall
import com.example.instaclone.ui.theme.storyColor

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun destaqueItem(story: Story) {
    Column(
        modifier = Modifier
            .padding(spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ) {
        GlideImage(
            model = story.avartar,
            "",
            Modifier
                .size(64.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .clip(CircleShape)
                .border(2.dp,storyColor, CircleShape), contentScale = ContentScale.Crop
        )
    }


}

@Preview(showBackground = true)
@Composable
fun preview() {

    destaqueItem(stories[0])

}