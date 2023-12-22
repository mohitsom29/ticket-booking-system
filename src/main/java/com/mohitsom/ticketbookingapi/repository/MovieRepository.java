package com.mohitsom.ticketbookingapi.repository;

import com.mohitsom.ticketbookingapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

    @Query(value = "SELECT movie_id, movie_name, movie_description, movie_trailer, movie_genres, movie_director, to_char(movie_release,'YYYY-MM-DD') as movie_release, movie_length, movie_format, movie_poster FROM movies where movie_release = CURRENT_DATE OR movie_release < CURRENT_DATE", nativeQuery = true)
    List<Movie> getMovies();

    @Query(value = "SELECT movie_id, movie_name, movie_description, movie_trailer, movie_genres, movie_director, to_char(movie_release,'YYYY-MM-DD') as movie_release, movie_length, movie_format, movie_poster FROM movies where movie_release > CURRENT_DATE", nativeQuery = true)
    List<Movie> getMoviesFuture();

    @Query(value = "SELECT movie_id, movie_name, movie_description, movie_trailer, movie_genres, movie_director, to_char(movie_release,'YYYY-MM-DD') as movie_release, movie_length, movie_format, movie_poster FROM movies where movie_director = :movieDirector",nativeQuery = true)
    List<Movie> getAllMoviesByDirector(@Param("movieDirector") String movieDirector);
}
