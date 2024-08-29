package com.example.funfact.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.funfact.ui.TopBar

@Composable
fun UserInputScreen(navController: NavHostController) {
    Surface( modifier= Modifier.fillMaxSize()) {
    Column(
        modifier= Modifier
            .fillMaxWidth()
            .padding(18.dp)
    )
    {
        TopBar(value = "Hi There \uD83D\uDE0A")
    }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen(rememberNavController())
}