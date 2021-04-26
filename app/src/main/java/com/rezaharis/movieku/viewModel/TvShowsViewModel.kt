package com.rezaharis.movieku.viewModel

import androidx.lifecycle.ViewModel
import com.rezaharis.movieku.model.DataTvShows
import com.rezaharis.movieku.utils.dummyData.TvShowsList

class TvShowsViewModel: ViewModel() {
    fun getTvShowsViewModel() = TvShowsList.getTvShowList()
    fun getTvShowsId(id: Int): DataTvShows = TvShowsList.getTvShowsId(id)
}