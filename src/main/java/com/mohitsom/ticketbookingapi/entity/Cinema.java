package com.mohitsom.ticketbookingapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cinemas")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_id")
    private Integer cinemaId;
    @Column(name = "cinema_name")
    private String cinemaName;
    @Column(name = "cinema_address")
    private String cinemaAddress;
    @Column(name = "cinema_movies")
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "cinema_movie",
            joinColumns = @JoinColumn(name = "cinemaId", referencedColumnName = "cinema_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private Set<Movie> movies = new HashSet<>();

}
