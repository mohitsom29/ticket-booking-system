package com.mohitsom.ticketbookingapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name="movies")
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private Integer movieId;
    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_description")
    private String movieDescription;

    @Column(name = "movie_trailer")
    private String movieTrailer;

    @Column(name = "movie_genres")
    private String movieGenres;

    @Column(name = "movie_release")
    @Temporal(TemporalType.DATE)
    private Date movieRelease;

    @Column(name = "movie_lenght")
    private String movieLength;

    @Column(name = "movie_format")
    private String movieFormat;

    @Column(name = "movie_poster")
    private String moviePoster;
}
