package com.mohitsom.ticketbookingapi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequest {
    private String movieName;
    Set<Integer> cinemas = new HashSet<>();
}
