package com.example.modularappwithjetcomposecleanarct.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.modularappwithjetcomposecleanarct.ui.viewmodels.NewsViewModel
import com.example.utility.ResourceState

@Composable
fun HomeScreenComposable  ( newsViewModel: NewsViewModel = hiltViewModel())
{
    val newsResponse by newsViewModel.newsStateFlow.collectAsState()
    Surface(modifier = Modifier.fillMaxSize()) {
        when(newsResponse){

            is ResourceState.Loading ->{

            }
            is ResourceState.Success ->{

            }
            is ResourceState.Error ->{

            }
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    HomeScreenComposable()
}