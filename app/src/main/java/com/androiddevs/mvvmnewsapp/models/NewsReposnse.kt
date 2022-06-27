package com.androiddevs.mvvmnewsapp.models

data class NewsReposnse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)