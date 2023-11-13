package com.example.modularappwithjetcomposecleanarct.datalayer.datasource

import com.example.modularappwithjetcomposecleanarct.datalayer.entity.NewsResponseEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsDataSource {

    suspend fun getNews(country:String): Response<NewsResponseEntity>

}