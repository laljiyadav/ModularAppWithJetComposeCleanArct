package com.example.modularappwithjetcomposecleanarct.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.modularappwithjetcomposecleanarct.ui.navigationCompose.Routes
import com.example.modularappwithjetcomposecleanarct.ui.screens.HomeScreenComposable

@Composable
fun AppNavigationComposeGraph()
{

    val navController = rememberNavController()

    NavHost(navController=navController, startDestination = Routes.HOME){
            composable(Routes.HOME){
                HomeScreenComposable()
            }
    }
}