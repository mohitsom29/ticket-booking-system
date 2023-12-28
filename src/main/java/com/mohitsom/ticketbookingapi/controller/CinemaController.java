package com.mohitsom.ticketbookingapi.controller;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import com.mohitsom.ticketbookingapi.request.CinemaRequest;
import com.mohitsom.ticketbookingapi.request.MovieRequest;
import com.mohitsom.ticketbookingapi.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @PostMapping("/cinema")
    public Cinema createCinema(@RequestBody Cinema cinema)
    {
        return cinemaService.createCinema(cinema);
    }

    @GetMapping()
    public List<Cinema> getCinemas() {
        return cinemaService.getCinemas();
    }

}
