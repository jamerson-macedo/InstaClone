package com.example.instaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.instaclone.ui.theme.InstaCloneTheme
import com.example.instaclone.view.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaCloneTheme {
                LoginScreen()
            }
        }
    }
}

