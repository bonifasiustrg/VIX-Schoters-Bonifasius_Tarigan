package com.bonifasiustrg.newsapp.newsAdapter.db

import androidx.room.TypeConverter
import com.bonifasiustrg.newsapp.newsAdapter.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}