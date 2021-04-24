package com.rezaharis.movieku.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezaharis.movieku.databinding.ActivityDetailTvShowBinding
import com.rezaharis.movieku.model.DataTvShows

class DetailTvShow : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvShowBinding

    companion object{
        const val TV_SH0WS = "tv_shows"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        getTvShows()
    }

    private fun getTvShows(){
        val tvShows = intent.getParcelableExtra<DataTvShows>(TV_SH0WS) as DataTvShows
        binding.ivPosterTvshows.setImageResource(tvShows.poster)
        binding.tvCategoryTvshows.text = tvShows.category
        binding.tvDesTvshows.text = tvShows.description
        binding.tvTvshows.text = tvShows.tvShowsName
    }
}