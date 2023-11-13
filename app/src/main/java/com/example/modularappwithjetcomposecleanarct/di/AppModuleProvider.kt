package com.example.modularappwithjetcomposecleanarct.di

import com.example.modularappwithjetcomposecleanarct.datalayer.api.ApiServices
import com.example.modularappwithjetcomposecleanarct.datalayer.api.AppConstant
import com.example.modularappwithjetcomposecleanarct.datalayer.datasource.NewsDataSource
import com.example.modularappwithjetcomposecleanarct.datalayer.datasource.NewsDataSourceImpl
import com.example.modularappwithjetcomposecleanarct.ui.repositories.NewsRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModuleProvider {


    @Provides
    @Singleton
    fun providerRetrofit():Retrofit
    {
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level=HttpLoggingInterceptor.Level.BASIC
        }

        val  httpClient =OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
        }

        httpClient.apply {
            readTimeout(60,TimeUnit.SECONDS)
        }

        val  moshi=Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        return Retrofit.Builder().baseUrl(AppConstant.APP_BASE_URL).
        client(httpClient.build()).
        addConverterFactory(MoshiConverterFactory.create(moshi)).build()
    }


    @Singleton
    @Provides
    fun providesApiServices(retrofit: Retrofit):ApiServices{
        return retrofit.create(ApiServices::class.java)
    }

    @Singleton
    @Provides
    fun providesNewsDataSource(apiServices: ApiServices):NewsDataSource{
        return NewsDataSourceImpl(apiServices)
    }

    @Singleton
    @Provides
    fun providesNewsRepository(newsDataSource: NewsDataSource):NewsRepository{
        return NewsRepository(newsDataSource)
    }
}