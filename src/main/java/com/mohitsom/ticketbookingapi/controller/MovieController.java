package com.mohitsom.ticketbookingapi.controller;

import com.mohitsom.ticketbookingapi.entity.Movie;
import com.mohitsom.ticketbookingapi.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@Tag(name="Api Movie")
@RequiredArgsConstructor
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Operation(description = "Save the movie in the Database")
    @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie)
    {
        //System.out.println("movieService: " + movieService);
        return movieService.saveMovie(movie);
    }

    @Operation(description = "Fetch Movie with his unique ID")
    @GetMapping("/movie/{id}")
    public Movie fetchMovieById(@PathVariable("id") Integer movieId)
    {
        return movieService.fetchMovieById(movieId);
    }

    @Operation(description = "Delete movie id with his particular unique ID")
    @DeleteMapping("/movie/{id}")
    public String deleteMovieById(@PathVariable("id") Integer movieId)
    {
        movieService.deleteMovieById(movieId);
        return "Department Deleted Successfully";
    }

    @Operation(description = "Update the movie in the database using particular unique ID")
    @PutMapping("/movie/{id}")
    public Movie updateMovie(@PathVariable("id") Integer movieId, @RequestBody Movie movie)
    {
        return movieService.updateMovie(movieId,movie);
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

    @Operation(description = "Get the list of movies by there director name")
    @GetMapping("/{director}")
    public ResponseEntity<?> getAllMoviesByDirector(@PathVariable("director") String movieDirector) {
        return ResponseEntity.ok(movieService.getAllMoviesByDirector(movieDirector));
    }
}
