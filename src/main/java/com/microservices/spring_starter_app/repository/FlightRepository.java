package com.microservices.spring_starter_app.repository;

import com.microservices.spring_starter_app.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByOriginAndDestination(String origin, String destination);
    Flight findByFlightNumber(String flightNumber);
}
