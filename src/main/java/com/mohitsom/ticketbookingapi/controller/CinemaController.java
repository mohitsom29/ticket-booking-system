package com.mohitsom.ticketbookingapi.controller;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;
import com.mohitsom.ticketbookingapi.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cinemas")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    public Cinema createCinemaWithMovies(@RequestBody CinemaRequest cinemaRequest)
    {
        return cinemaService.createCinemaWithMovies(cinemaRequest);
    }
}
