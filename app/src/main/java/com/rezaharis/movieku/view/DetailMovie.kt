package com.rezaharis.movieku.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezaharis.movieku.databinding.ActivityDetailMovieBinding
import com.rezaharis.movieku.model.DataMovie

class DetailMovie : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding

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

        getMovie()
    }

    private fun getMovie(){
        val movie = intent.getParcelableExtra<DataMovie>(MOVIE) as DataMovie
        binding.tvMovie.text = movie.movieName
        binding.ivPoster.setImageResource(movie.poster)
        binding.tvCategory.text = movie.category
        binding.tvDes.text = movie.description
    }
}