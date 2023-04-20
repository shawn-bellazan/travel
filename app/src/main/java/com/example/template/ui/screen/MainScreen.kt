package com.example.template.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Preview
@Composable
fun MainScreen(
    navController: NavController = NavController(LocalContext.current)
) {
    Text(text = "Main Screen")
}