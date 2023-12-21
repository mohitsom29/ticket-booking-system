package com.mohitsom.ticketbookingapi.controller;

import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@Tag(name="Api Movie")
@RequiredArgsConstructor
public class MovieController {
    private MovieService movieService;

    @Operation(description = "Save the movie in the Database")
    @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie)
    {
        //System.out.println("movieService: " + movieService);
        return movieService.saveMovie(movie);
    }

    @Operation(description = "Get the list of movies")
    @GetMapping("")
    public ResponseEntity<?> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @Operation(description = "Get the list of currently showing movies")
    @GetMapping("/now")
    public ResponseEntity<?> getMoviesNow(){
        return ResponseEntity.ok(movieService.getMovies());
    }

    @Operation(description = "Get the list of upcoming movies")
    @GetMapping("/future")
    public ResponseEntity<?> getMoviesFuture() {
        return ResponseEntity.ok(movieService.getMoviesFuture());
    }
}
