package com.rezaharis.movieku.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rezaharis.movieku.viewModel.MovieViewModel
import com.rezaharis.movieku.adapter.MovieAdapter
import com.rezaharis.movieku.adapter.TvShowsAdapter
import com.rezaharis.movieku.databinding.ActivityMainBinding
import com.rezaharis.movieku.model.DataMovie
import com.rezaharis.movieku.model.DataTvShows
import com.rezaharis.movieku.viewModel.TvShowsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var tvShowsAdapter: TvShowsAdapter
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var tvShowsViewModel: TvShowsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setMovieViewModel()
        setTvShowsViewModel()
    }

    private fun setMovieViewModel(){
        movieViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MovieViewModel::class.java)
        val movieList = movieViewModel.getMovieViewModel()
        movieAdapter = MovieAdapter(mutableListOf<DataMovie>() as ArrayList<DataMovie>)
        setMovieAdapter()
        movieAdapter.setData(movieList)
    }

    private fun setTvShowsViewModel(){
        tvShowsViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(TvShowsViewModel::class.java)
        val tvShowsList = tvShowsViewModel.getTvShowsViewModel()
        tvShowsAdapter = TvShowsAdapter(mutableListOf<DataTvShows>() as ArrayList<DataTvShows>)
        setTvShowsAdapter()
        tvShowsAdapter.setData(tvShowsList)
    }

    private fun setMovieAdapter(){
        binding.crRview.adapter = movieAdapter
        binding.crRview.setHasFixedSize(true)
        binding.crRview.set3DItem(true)
        binding.crRview.setInfinite(true)
        binding.crRview.setAlpha(true)
        binding.crRview.getCarouselLayoutManager()
        binding.crRview.getSelectedPosition()
        binding.crRview.setHasFixedSize(true)
        movieAdapter.notifyDataSetChanged()
    }

    private fun setTvShowsAdapter(){
        binding.crTvshows.adapter = tvShowsAdapter
        binding.crTvshows.setHasFixedSize(true)
        binding.crTvshows.set3DItem(true)
        binding.crTvshows.setInfinite(true)
        binding.crTvshows.setAlpha(true)
        binding.crTvshows.getCarouselLayoutManager()
        binding.crTvshows.getSelectedPosition()
        binding.crTvshows.setHasFixedSize(true)
        tvShowsAdapter.notifyDataSetChanged()
    }
}