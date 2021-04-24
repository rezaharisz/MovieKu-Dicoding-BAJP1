package com.rezaharis.movieku.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataTvShows(
        val poster: Int,
        val tvShowsName: String,
        val description: String,
        val category: String
): Parcelable
