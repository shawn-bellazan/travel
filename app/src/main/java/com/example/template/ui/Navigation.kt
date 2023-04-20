package com.example.template.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.template.ui.screen.MainScreen
import com.example.template.ui.screen.ScreenType

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenType.MainScreen.name) {
        //
        composable(ScreenType.MainScreen.name) {
            Log.d("Nav", "Accessing Nav")
            MainScreen(navController)
        }
    }
}