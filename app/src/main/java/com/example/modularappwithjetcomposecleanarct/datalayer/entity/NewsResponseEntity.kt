package com.example.modularappwithjetcomposecleanarct.datalayer.entity

data class NewsResponseEntity(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)