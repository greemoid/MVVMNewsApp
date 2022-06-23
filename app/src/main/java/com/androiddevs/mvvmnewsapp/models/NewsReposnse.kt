package com.androiddevs.mvvmnewsapp.models

data class NewsReposnse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)