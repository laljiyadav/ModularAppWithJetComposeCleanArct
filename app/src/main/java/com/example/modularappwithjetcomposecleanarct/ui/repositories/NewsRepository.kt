package com.example.modularappwithjetcomposecleanarct.ui.repositories

import com.example.modularappwithjetcomposecleanarct.datalayer.datasource.NewsDataSource
import com.example.modularappwithjetcomposecleanarct.datalayer.entity.NewsResponseEntity
import com.example.utility.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {

   suspend fun getNews(country:String): Response<NewsResponseEntity>{
        return newsDataSource.getNews(country)
    }

    suspend fun getNewsWithFlow(country: String):Flow<ResourceState<NewsResponseEntity>>{
        return flow {
            emit(ResourceState.Loading())
            val response=newsDataSource.getNews(country)

            if (response.isSuccessful && response.body()!=null)
            {
                emit(ResourceState.Success(response.body()!!))
            }else{
                emit(ResourceState.Error(response.errorBody()!!))
            }
        }.catch { e->
            emit(ResourceState.Error(e?.localizedMessage?:"Something error in flow !!"))
        }
    }
}