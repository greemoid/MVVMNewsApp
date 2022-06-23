package com.androiddevs.mvvmnewsapp

data class NewsReposnse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)