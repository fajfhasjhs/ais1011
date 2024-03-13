package com.example.myapplicationjjtgyhjgjgthjgjgjgjh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationjjtgyhjgjgthjgjgjgjh.ui.theme.MyApplicationjjtgyhjgjgthjgjgjgjhTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationjjtgyhjgjgthjgjgjgjhTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Fais Al Qori")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color= Color.Green) {
        Text(
            text = "Hello $name! Kamu pasti bisa menyelesaikan semua!",
            modifier = Modifier.padding(24.dp),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            lineHeight = 40.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationjjtgyhjgjgthjgjgjgjhTheme {
        Greeting("Fais Al Qori")
    }
}