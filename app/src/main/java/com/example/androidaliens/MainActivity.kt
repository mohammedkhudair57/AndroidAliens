package com.example.androidaliens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.androidaliens.ui.AndroidAliens
import com.example.androidaliens.ui.theme.AndroidAliensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAliensTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AndroidAliens()
                    // new commit
                    println("Android Dojo")
                    println("Android Dojo22")
                    AndroidDojo()
                }
            }
        }
    }
}


 private fun AndroidDojo(){
     println("Android Dojo")
 }