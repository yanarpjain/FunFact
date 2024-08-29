package com.example.funfact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavAction
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funfact.ui.screen.FunFactsNavigationGraph
import com.example.funfact.ui.screen.Routes
import com.example.funfact.ui.screen.UserInputScreen
import com.example.funfact.ui.screen.WelcomeScreen
import com.example.funfact.ui.theme.FunFactTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FunFactTheme {

                FunFactsApp()
            }
        }
    }


@Composable
fun FunFactsApp(){

   FunFactsNavigationGraph()
 }
}
