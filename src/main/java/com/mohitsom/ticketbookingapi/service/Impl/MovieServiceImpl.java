package com.mohitsom.ticketbookingapi.service.Impl;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.repository.CinemaRepository;
import com.mohitsom.ticketbookingapi.repository.MovieRepository;
import com.mohitsom.ticketbookingapi.request.MovieRequest;
import com.mohitsom.ticketbookingapi.service.MovieService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CinemaRepository cinemaRepository;

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

    @Override
    public Movie fetchMovieById(Integer movieId) {
        return movieRepository.findById(movieId).get();
    }

    @Override
    public void deleteMovieById(Integer movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public Movie updateMovie(Integer movieId, Movie movie) {
        Movie movieDB = movieRepository.findById(movieId).get();
        if(Objects.nonNull(movie.getMovieName()) && !"".equalsIgnoreCase(movie.getMovieName()))
        {
            movieDB.setMovieName(movie.getMovieName());
        }
        if(Objects.nonNull(movie.getMovieDescription()) && !"".equalsIgnoreCase(movie.getMovieDescription()))
        {
            movieDB.setMovieName(movie.getMovieDescription());
        }
        if(Objects.nonNull(movie.getMovieTrailer()) && !"".equalsIgnoreCase(movie.getMovieTrailer()))
        {
            movieDB.setMovieName(movie.getMovieTrailer());
        }
        if(Objects.nonNull(movie.getMovieGenres()) && !"".equalsIgnoreCase(movie.getMovieGenres()))
        {
            movieDB.setMovieName(movie.getMovieGenres());
        }
        if(Objects.nonNull(movie.getMovieFormat()) && !"".equalsIgnoreCase(movie.getMovieFormat()))
        {
            movieDB.setMovieName(movie.getMovieFormat());
        }
        if(Objects.nonNull(movie.getMoviePoster()) && !"".equalsIgnoreCase(movie.getMoviePoster()))
        {
            movieDB.setMovieName(movie.getMoviePoster());
        }
        if(Objects.nonNull(movie.getMovieLength()) && !"".equalsIgnoreCase(movie.getMovieLength()))
        {
            movieDB.setMovieLength(movie.getMovieLength());
        }
        if(Objects.nonNull(movie.getMovieRelease()))
        {
            movieDB.setMovieName(String.valueOf(movie.getMovieRelease()));
        }
        return movieRepository.save(movieDB);
    }

    @Override
    public List<Movie> getAllMoviesByDirector(String movieDirector) {
        return movieRepository.getAllMoviesByDirector(movieDirector);
    }
}
