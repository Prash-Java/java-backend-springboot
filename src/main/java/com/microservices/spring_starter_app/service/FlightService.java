package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.Flight;
import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<Flight> getAllFlights();
    Optional<Flight> getFlightById(Long id);
    Flight createFlight(Flight flight);
    Flight updateFlight(Long id, Flight flight);
    void deleteFlight(Long id);
}
