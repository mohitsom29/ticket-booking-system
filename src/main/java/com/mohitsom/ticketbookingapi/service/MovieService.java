package com.mohitsom.ticketbookingapi.service;

import com.mohitsom.ticketbookingapi.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {

    public List<Movie> getAllMovies();
    public List<Movie> getMovies();
    public List<Movie> getMoviesFuture();
    public Movie saveMovie(Movie movie);
}
