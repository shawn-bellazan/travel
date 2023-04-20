package com.tooensure.travel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.tooensure.travel.ui.theme.TravelTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainContent {
              Navigation()
           }
        }
    }
}

@Composable
fun MainContent(content: @Composable () -> Unit) {
    TravelTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                content()
            }
        }
    }
}

@Composable
fun Navigation() {
    val viewModel = hiltViewModel<MainViewModel>()

    AccountScreen(
        viewModel
    )
}

@Composable
fun AccountScreen(
    viewModel: MainViewModel) {
    val title = viewModel.get()
    if (title!!.isNotBlank())
        Text(text = title)
    else Text(text = "There's nothing here")
}
