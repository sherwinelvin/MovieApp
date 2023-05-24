package com.example.movieapp.data.datasource

import com.example.movieapp.data.db.model.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)


}