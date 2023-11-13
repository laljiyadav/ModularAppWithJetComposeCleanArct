package com.example.modularappwithjetcomposecleanarct.datalayer.datasource

import com.example.modularappwithjetcomposecleanarct.datalayer.api.ApiServices
import com.example.modularappwithjetcomposecleanarct.datalayer.entity.NewsResponseEntity
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(private val apiServices: ApiServices) :NewsDataSource {

    override suspend fun getNews(country: String): Response<NewsResponseEntity> {
        return apiServices.getNews(country)
    }
}