package com.example.template.ui.screen

enum class ScreenType {
    MainScreen;

    companion object {
        fun fromRoute(route: String?): ScreenType =
            when(route?.substringBefore("/")) {
                MainScreen.name -> MainScreen
                null -> MainScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }
}