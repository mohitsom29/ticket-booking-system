package com.mohitsom.ticketbookingapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @ManyToMany(
            mappedBy = "cinemas",
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private Set<Movie> movies = new HashSet<>();
}
