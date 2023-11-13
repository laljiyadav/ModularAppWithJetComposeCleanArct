package com.example.modularappwithjetcomposecleanarct.datalayer.api

import com.example.modularappwithjetcomposecleanarct.datalayer.entity.NewsResponseEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("v2/top-headlines")
    suspend fun getNews(@Query("country") country:String,@Query("apiKey") apiKey:String="df34ce77545540a0ae8681f5ccfcd611"):Response<NewsResponseEntity>

}