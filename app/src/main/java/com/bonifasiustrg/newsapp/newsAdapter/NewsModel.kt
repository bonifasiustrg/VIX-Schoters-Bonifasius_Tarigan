package com.bonifasiustrg.newsapp.newsAdapter

import com.bonifasiustrg.newsapp.R

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news(
            "Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
            "beritapedia | 1 Jam yang lalu",
            R.drawable.img_news1
        ),

        news(
            "Kapal Nelayan menyalurkan bansos masyarakat Sulawesi",
            "beritapedia | 1 Jam yang lalu",
            R.drawable.img_news2
        ),

        news(
            "Macet mulai terjadi di wilayah jalur pemudik semarang",
            "beritapedia | 2 jam yang lalu",
            R.drawable.img_news3
        ),

        news(
            "Jelang new normal jakarta macet lagi",
            "beritapedia | 3 jam yang lalu",
            R.drawable.img_news4
        ),

        news(
            "Dukung indonesia perangi covid-19, sampoerna donasi ventilator dan APD Full Set",
            "beritapedia | 4 jam yang lalu",
            R.drawable.img_news5
        ),

        news(
            "Saat risma jelaskan soal penanganan corona pada kepala BNpB dan Menkes",
            "beritapedia | 5 jam yang lalu",
            R.drawable.img_news6
        ),

        news(
            "Banjir keritik ke trump yang kerahkan militer usai demo george floyd",
            "beritapedia | 6 jam yang lalu",
            R.drawable.img_news7
        ),

        news(
            "Mengapa aksi demo damai kasus george floyd bisa berubah jadi kerusuhan?",
            "beritapedia | 8 jam yang lalu",
            R.drawable.img_news8
        ),

        news(
            "2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
            "beritapedia | 1 menit yang lalu",
            R.drawable.img_news9
        )
    )
}
