package com.example.movieapp.data.datasourceImpl

import com.example.movieapp.data.datasource.MovieLocalDataSource
import com.example.movieapp.data.db.MovieDao
import com.example.movieapp.data.db.model.Movie
import com.example.movieapp.data.db.model.MovieList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MovieLocalDataSourceImpl(
    private val movieDao: MovieDao
) :
    MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.getMovies()
    }


    override suspend fun saveMovieToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO
       ).launch {
         movieDao.deleteAllMovies()
       }
    }
}

