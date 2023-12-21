package com.mohitsom.ticketbookingapi.repository;

import com.mohitsom.ticketbookingapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Query(value = "SELECT movie_id, movie_name, movie_description, movie_trailer, movie_genres, to_char(movie_release,'Mon-dd-YYYY') as movie_release, movie_length, movie_format, movie_poster" + "FROM movies where movie_release = CURRENT_DATE OR movie_release < CURRENT_DATE", nativeQuery = true)
    List<Movie> getMovies();

    @Query(value = "SELECT movie_id, movie_name, movie_description, movie_trailer, movie_genres, to_char(movie_release,'Mon-dd-YYYY') as movie_release, movie_length, movie_format, movie_poster" + "FROM movies where movie_release = CURRENT_DATE", nativeQuery = true)
    List<Movie> getMoviesFuture();
}
