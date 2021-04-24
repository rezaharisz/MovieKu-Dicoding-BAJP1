package com.rezaharis.movieku.viewModel

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
        val movie = movieViewModel.setMovie()
        assertNotNull(movie)
        assertEquals(10,movie.size)
    }
}