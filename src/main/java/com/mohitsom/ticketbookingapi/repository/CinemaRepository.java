package com.mohitsom.ticketbookingapi.repository;

import com.mohitsom.ticketbookingapi.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {

}
