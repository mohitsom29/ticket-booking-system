package com.mohitsom.ticketbookingapi.service.Impl;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.repository.CinemaRepository;
import com.mohitsom.ticketbookingapi.repository.MovieRepository;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;
import com.mohitsom.ticketbookingapi.request.MovieRequest;
import com.mohitsom.ticketbookingapi.service.CinemaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Cinema createCinema(Cinema cinema) {
          cinemaRepository.save(cinema);
          return cinema;
    }

    @Override
    public List<Cinema> getCinemas() {
        return cinemaRepository.findAll();
    }
}
