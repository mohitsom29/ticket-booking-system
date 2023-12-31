package com.mohitsom.ticketbookingapi.service;

import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.request.MovieRequest;

import java.util.List;

public interface MovieService {

    public List<Movie> getAllMovies();
    public List<Movie> getMovies();
    public List<Movie> getMoviesFuture();
    public Movie saveMovie(Movie movie);

   public Movie fetchMovieById(Integer movieId);

    void deleteMovieById(Integer movieId);

    Movie updateMovie(Integer movieId, Movie movie);

    public List<Movie> getAllMoviesByDirector(String movieDirector);

    Movie assignCinemaToMovie(Integer movieId, Integer cinemaId);
}
