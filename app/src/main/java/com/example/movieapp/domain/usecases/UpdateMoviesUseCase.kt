package com.example.movieapp.domain.usecases

import com.example.movieapp.data.db.model.Movie
import com.example.movieapp.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>?= movieRepository.updateMovies()
}