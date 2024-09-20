package com.example.movieapp.Navigation

enum class MoivieScreens{
      HomeScreen,
    DetailsScreen;
    companion object { // companion object is used when we donot want to create the instance of any element of the class
        fun fromRoute(route: String?): MoivieScreens
        = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route not recognized")
        }
    }
}