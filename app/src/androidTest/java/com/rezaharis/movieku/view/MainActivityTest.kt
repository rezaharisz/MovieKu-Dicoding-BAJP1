package com.rezaharis.movieku.view

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.rezaharis.movieku.R
import com.rezaharis.movieku.utils.dummyData.MovieList
import com.rezaharis.movieku.utils.dummyData.TvShowsList
import org.junit.Before
import org.junit.Test

class MainActivityTest{
    private val movie = MovieList.getMovieList()
    private val tvShows = TvShowsList.getTvShowList()

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testMovies(){
        onView(withId(R.id.cr_rview)).check(matches(isDisplayed()))
                .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movie.size - 1))
    }

    @Test
    fun testClickDetailMovies(){
        onView(withId(R.id.cr_rview))
                .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_movie))
                .check(matches(isDisplayed()))
                .check(matches(withText(movie[0].movieName)))
        onView(withId(R.id.tv_category))
                .check(matches(isDisplayed()))
                .check(matches(withText(movie[0].category)))
        onView(withId(R.id.tv_des))
                .check(matches(isDisplayed()))
                .check(matches(withText(movie[0].description)))
    }

    @Test
    fun testTvShows(){
        onView(withId(R.id.cr_tvshows))
                .check(matches(isDisplayed())).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShows.size -1))
    }

    @Test
    fun testClickDetailTvShows(){
        onView(withId(R.id.cr_tvshows))
                .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_tvshows))
                .check(matches(isDisplayed()))
                .check(matches(withText(tvShows[0].tvShowsName)))
        onView(withId(R.id.tv_category_tvshows))
                .check(matches(isDisplayed()))
                .check(matches(withText(tvShows[0].category)))
        onView(withId(R.id.tv_des_tvshows))
                .check(matches(isDisplayed()))
                .check(matches(withText(tvShows[0].description)))
    }
}