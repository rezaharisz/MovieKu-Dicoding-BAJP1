package com.rezaharis.movieku.viewModel

import androidx.lifecycle.ViewModel
import com.rezaharis.movieku.model.DataMovie
import com.rezaharis.movieku.utils.dummyData.MovieList

class MovieViewModel: ViewModel() {
    fun getMovieViewModel() = MovieList.getMovieList()
    fun getMovieId(id: Int): DataMovie = MovieList.getMovieId(id)
}