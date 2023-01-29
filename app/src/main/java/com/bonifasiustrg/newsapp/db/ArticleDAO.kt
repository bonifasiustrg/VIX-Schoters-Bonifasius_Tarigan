package com.bonifasiustrg.newsapp.newsAdapter.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bonifasiustrg.newsapp.newsAdapter.Article

@Dao
interface ArticleDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Delete
    suspend fun deleteArticle(article: Article)

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>
}
