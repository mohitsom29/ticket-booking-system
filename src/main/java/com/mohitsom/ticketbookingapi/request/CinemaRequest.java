package com.mohitsom.ticketbookingapi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaRequest {
    private String cinemaName;
    private String cinemaAddress;
    private Set<Integer> movieId;
}
