package com.example.movieapp.data.datasource

import com.example.movieapp.data.db.model.Movie
import com.example.movieapp.data.db.model.MovieList
import retrofit2.Response

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>

    suspend fun saveMovieToDB(movies:List<Movie>)

     suspend fun clearAll()

}