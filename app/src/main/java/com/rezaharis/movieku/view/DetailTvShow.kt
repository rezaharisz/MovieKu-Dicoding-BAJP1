package com.rezaharis.movieku.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.rezaharis.movieku.databinding.ActivityDetailTvShowBinding
import com.rezaharis.movieku.model.DataTvShows
import com.rezaharis.movieku.viewModel.TvShowsViewModel

class DetailTvShow : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvShowBinding
    private lateinit var tvShowsViewModel: TvShowsViewModel

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

        tvShowsViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(TvShowsViewModel::class.java)
        getTvShows(tvShowsViewModel.getTvShowsId(intent.getIntExtra(TV_SH0WS, 0)))

    }

    private fun getTvShows(tvShows: DataTvShows){
        Glide.with(this)
                .load(tvShows.poster)
                .override(250, 320)
                .into(binding.ivPosterTvshows)
        binding.tvCategoryTvshows.text = tvShows.category
        binding.tvDesTvshows.text = tvShows.description
        binding.tvTvshows.text = tvShows.tvShowsName
    }
}