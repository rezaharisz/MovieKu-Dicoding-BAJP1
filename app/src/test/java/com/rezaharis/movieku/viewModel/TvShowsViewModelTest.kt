package com.rezaharis.movieku.viewModel

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TvShowsViewModelTest{
    private lateinit var tvShowsViewModel: TvShowsViewModel

    @Before
    fun setUp(){
        tvShowsViewModel = TvShowsViewModel()
    }

    @Test
    fun getTvShowsTest(){
        val tvShows = tvShowsViewModel.setTvShows()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }
}