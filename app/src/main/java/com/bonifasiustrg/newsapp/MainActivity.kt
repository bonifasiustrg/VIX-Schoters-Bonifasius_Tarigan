package com.bonifasiustrg.newsapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bonifasiustrg.newsapp.newsAdapter.NewsAdapter
import com.bonifasiustrg.newsapp.newsAdapter.NewsModel
import com.bonifasiustrg.newsapp.newsAdapter.news
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    private lateinit var newsAdapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var headlinenews: news?
        if (NewsModel.newslist.size > 0) {

            headlinenews = NewsModel.newslist[NewsModel.newslist.size -1]
            tvw_TitleHeadLine.setText(headlinenews.title)
            tvw_DescHeadline.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.photo)

            cdv_newsheadline.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_KontenNews, headlinenews.desc)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                    }

                startActivity(intent_detail)
                finish()
            }
        }

        var layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newslist)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback {
            override fun onItemClick(data: news) {

                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                        putExtra(DetailActivity.cont_KontenNews, data.desc.toString())
                    }

                startActivity(intent)
                finish()

            }
        })

        val profileImage = findViewById<ImageView>(R.id.img_profile)
        profileImage.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bottom, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuBookmark -> {
                Toast.makeText(this, "Bookmarked News", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, BookmarkActivity::class.java))

            }
            R.id.menuProfile -> {
                Toast.makeText(this, "Your Profile", Toast.LENGTH_SHORT).show()
            }
            R.id.menuHome -> {
                Toast.makeText(this, "Homepage", Toast.LENGTH_SHORT).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }
}