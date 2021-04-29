package com.rezaharis.movieku.viewModel

import com.rezaharis.movieku.utils.dummyData.MovieList
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MovieViewModelTest{
    private lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp(){
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getMovieTest(){
        val movie = movieViewModel.getMovieViewModel()
        assertNotNull(movie)
        assertEquals(10,movie.size)
    }

    @Test
    fun getMovieId(){
        val movieId = MovieList.getMovieList().get(0)
        val getMovieId = movieViewModel.getMovieId(movieId.id)

        assertEquals(0, getMovieId.id)
    }
}