package com.bonifasiustrg.newsapp.newsAdapter

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.xml.transform.Source

@Entity(tableName = "articles")
data class Article(

    @PrimaryKey(autoGenerate = true)

    var id: Int? = null,
    val author : String?,
    val content : String?,
    val description : String?,
    val publishedAt : String?,
    val source : Source?,
    val title : String?,
    val url : String?,
    val urlToImage : String?,
): java.io.Serializable
