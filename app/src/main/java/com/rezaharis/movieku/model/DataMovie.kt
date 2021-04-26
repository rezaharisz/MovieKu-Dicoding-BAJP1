package com.rezaharis.movieku.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataMovie(
    val id: Int,
    val poster: Int,
    val movieName: String,
    val description: String,
    val category: String
): Parcelable
