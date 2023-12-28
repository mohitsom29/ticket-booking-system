package com.mohitsom.ticketbookingapi.service;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;
import com.mohitsom.ticketbookingapi.request.MovieRequest;

import java.util.List;

public interface CinemaService {
    public Cinema createCinema(Cinema cinema);

    List<Cinema> getCinemas();
}
