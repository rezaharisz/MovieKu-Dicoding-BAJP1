package com.rezaharis.movieku.viewModel

import androidx.lifecycle.ViewModel
import com.rezaharis.movieku.utils.dummyData.TvShowsList

class TvShowsViewModel: ViewModel() {
    fun getTvShowsViewModel() = TvShowsList.getTvShowList()
}

//TEST TO PULL
