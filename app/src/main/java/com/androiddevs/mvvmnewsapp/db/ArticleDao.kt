package com.androiddevs.mvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androiddevs.mvvmnewsapp.models.Article


@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long //upsert - update or insert; fun returns id

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>> //suspend functions don`t work with LiveData

    @Delete
    suspend fun deleteArticle(article: Article)
}