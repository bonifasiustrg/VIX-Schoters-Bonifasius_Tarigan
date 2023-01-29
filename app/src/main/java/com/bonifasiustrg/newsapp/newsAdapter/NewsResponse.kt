package com.bonifasiustrg.newsapp.newsAdapter

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResult: Int
)
