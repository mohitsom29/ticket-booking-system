package com.mohitsom.ticketbookingapi.repository;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {


}
