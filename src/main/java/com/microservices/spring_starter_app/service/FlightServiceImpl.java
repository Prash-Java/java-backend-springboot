package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.Flight;
import com.microservices.spring_starter_app.service.FlightService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class FlightServiceImpl implements FlightService {
    private final Map<Long, Flight> flights = new HashMap<>();
    private long idCounter = 1;

    @Override
    public List<Flight> getAllFlights() {
        return new ArrayList<>(flights.values());
    }

    @Override
    public Optional<Flight> getFlightById(Long id) {
        return Optional.ofNullable(flights.get(id));
    }

    @Override
    public Flight createFlight(Flight flight) {
        flight.setId(idCounter++);
        flights.put(flight.getId(), flight);
        return flight;
    }

    @Override
    public Flight updateFlight(Long id, Flight flight) {
        flight.setId(id);
        flights.put(id, flight);
        return flight;
    }

    @Override
    public void deleteFlight(Long id) {
        flights.remove(id);
    }
}
