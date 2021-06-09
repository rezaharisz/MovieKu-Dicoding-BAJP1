@file:Suppress("DEPRECATION")

package com.rezaharis.movieku.viewModel

import com.rezaharis.movieku.utils.dummyData.TvShowsList
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
        val tvShows = tvShowsViewModel.getTvShowsViewModel()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }

    @Test
    fun getTvShowsId(){
        val tvShowsId = TvShowsList.getTvShowList()[0]
        val getTvShowsId = tvShowsViewModel.getTvShowsId(tvShowsId.id)

        assertEquals(0, getTvShowsId.id)
    }
}