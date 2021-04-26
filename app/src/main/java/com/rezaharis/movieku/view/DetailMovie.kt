package com.rezaharis.movieku.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.rezaharis.movieku.databinding.ActivityDetailMovieBinding
import com.rezaharis.movieku.model.DataMovie
import com.rezaharis.movieku.viewModel.MovieViewModel

class DetailMovie : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var movieViewModel: MovieViewModel

    companion object{
        const val MOVIE = "movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        movieViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MovieViewModel::class.java)
        getMovie(movieViewModel.getMovieId(intent.getIntExtra(MOVIE, 0)))
    }

    private fun getMovie(movie : DataMovie){
        Glide.with(this)
                .load(movie.poster)
                .override(250, 320)
                .into(binding.ivPoster)
        binding.tvMovie.text = movie.movieName
        binding.tvCategory.text = movie.category
        binding.tvDes.text = movie.description
    }
}