package com.memad.moviesmix.repos

import com.memad.moviesmix.data.local.MovieEntity
import com.memad.moviesmix.models.MoviesResponse
import com.memad.moviesmix.utils.Resource
import kotlinx.coroutines.flow.Flow

interface FavouritesRepo {

    suspend fun favouriteAMovie(movie: MovieEntity)

    suspend fun unFavouriteAMovie(movieId: Int)

    suspend fun checkIsFavourite(movieId: Int)

    suspend fun getFavouritesMovies(
        page: Int
    ): Flow<List<MovieEntity>>
}
