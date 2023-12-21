package com.mohitsom.ticketbookingapi.service.Impl;

import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.repository.MovieRepository;
import com.mohitsom.ticketbookingapi.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public List<Movie> getMovies() {
        List<Movie> currentMovies = movieRepository.getMovies();
        if(currentMovies.isEmpty())
        {
            return null;
        }
        return currentMovies;
    }

    public List<Movie> getMoviesFuture() {
        List<Movie> futureMovies = movieRepository.getMoviesFuture();
        if(futureMovies.isEmpty())
        {
            return null;
        }
        return futureMovies;
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
