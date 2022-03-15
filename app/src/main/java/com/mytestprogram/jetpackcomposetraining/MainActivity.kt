package com.mytestprogram.jetpackcomposetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.mytestprogram.jetpackcomposetraining.ui.HomeScreen
import com.mytestprogram.jetpackcomposetraining.ui.theme.JetpackComposeTrainingTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTrainingTheme {
                HomeScreen()
            }
        }
    }
}


