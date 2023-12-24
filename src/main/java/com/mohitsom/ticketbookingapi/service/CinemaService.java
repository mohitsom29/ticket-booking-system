package com.mohitsom.ticketbookingapi.service;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;

public interface CinemaService {
    public Cinema createCinemaWithMovies(CinemaRequest cinemaRequest);
}
