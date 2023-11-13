package com.example.modularappwithjetcomposecleanarct.ui.viewmodels

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.modularappwithjetcomposecleanarct.datalayer.api.AppConstant
import com.example.modularappwithjetcomposecleanarct.datalayer.entity.NewsResponseEntity
import com.example.modularappwithjetcomposecleanarct.ui.repositories.NewsRepository
import com.example.utility.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepository: NewsRepository):ViewModel() {

    companion object{
        const val TAG="NewsViewModel"
    }

    private val _newsMutableState : MutableStateFlow<ResourceState<NewsResponseEntity>> = MutableStateFlow(ResourceState.Loading())
    val newsStateFlow: StateFlow<ResourceState<NewsResponseEntity>> =_newsMutableState

   init {
       getNews(AppConstant.COUNTRY)
   }
    fun getNews(country:String)
    {
       viewModelScope.launch(Dispatchers.IO) {
           newsRepository.getNewsWithFlow(country).collectLatest { newsResponse ->
               _newsMutableState.value=newsResponse
           }
       }
    }
}