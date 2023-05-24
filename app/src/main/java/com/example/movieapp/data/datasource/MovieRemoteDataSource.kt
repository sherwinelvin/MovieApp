package com.example.movieapp.data.datasource

import com.example.movieapp.data.db.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies():Response<MovieList>
}