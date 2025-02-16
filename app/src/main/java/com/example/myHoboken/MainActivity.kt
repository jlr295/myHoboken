package com.example.myHoboken

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myHoboken.ui.theme.MyHobokenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MyHobokenTheme (darkTheme = false, dynamicColor = false) {
                MyHobokenApp()
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun MyHobokenAppPreview() {
    MyHobokenTheme (darkTheme = false, dynamicColor = false) {
        MyHobokenApp()
    }
}
