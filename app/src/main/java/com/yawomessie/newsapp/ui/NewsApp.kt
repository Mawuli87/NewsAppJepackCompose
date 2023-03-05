package com.yawomessie.newsapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yawomessie.newsapp.ui.screen.DetailScreen
import com.yawomessie.newsapp.ui.screen.TopNews

@Composable
fun NewsApp() {
    Navigation()
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "TopNews") {
        composable("TopNews") {
            TopNews(navController)
        }
        composable("Detail"){
              DetailScreen(navController)
        }
    }
}