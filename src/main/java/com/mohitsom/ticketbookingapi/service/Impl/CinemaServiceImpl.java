package com.mohitsom.ticketbookingapi.service.Impl;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.repository.CinemaRepository;
import com.mohitsom.ticketbookingapi.repository.MovieRepository;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;
import com.mohitsom.ticketbookingapi.service.CinemaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Cinema createCinemaWithMovies(CinemaRequest cinemaRequest) {
          Cinema cinema = new Cinema();
          cinema.setCinemaName(cinemaRequest.getCinemaName());
          cinema.setCinemaAddress(cinemaRequest.getCinemaAddress());
          Set<Integer> moviesId = cinemaRequest.getMovieId();
          for(Integer id : moviesId)
          {
               Optional<Movie> OptionalMovie = movieRepository.findById(id);
               if(OptionalMovie.isPresent())
               {
                   Movie movie = OptionalMovie.get();
                   cinema.getMovies().add(movie);
               }
               else throw new EntityNotFoundException("No movie is present with the Id in the database: " + id);
          }
          cinemaRepository.save(cinema);
          return cinema;
    }
}
