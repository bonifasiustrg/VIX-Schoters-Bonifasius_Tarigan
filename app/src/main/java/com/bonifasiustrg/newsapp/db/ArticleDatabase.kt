package com.bonifasiustrg.newsapp.newsAdapter.db

import android.content.Context
import androidx.room.*
import com.bonifasiustrg.newsapp.newsAdapter.Article
import retrofit2.Converter

//@Database(
//    entities = [Article::class],
//    version = 1
//)
//
//@TypeConverters(Converters::class)
abstract class ArticleDatabase: RoomDatabase() {

//    abstract fun getArticleDao(): ArticleDAO
//
//    companion object{
//        @Volatile
//        private var instance: ArticleDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: createDatabase(context).also{ instance = it}
//        }
//
//        private fun createDatabase(context: Context) =
//            Room.databaseBuilder(
//                context.applicationContext,
//                ArticleDatabase::class.java,
//                "article-db.db"
//            ).build()
//    }

}