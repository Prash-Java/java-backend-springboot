package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.Passenger;
import com.microservices.spring_starter_app.service.PassengerService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PassengerServiceImpl implements PassengerService {
    private final Map<Long, Passenger> passengers = new HashMap<>();
    private long idCounter = 1;

    @Override
    public List<Passenger> getAllPassengers() {
        return new ArrayList<>(passengers.values());
    }

    @Override
    public Optional<Passenger> getPassengerById(Long id) {
        return Optional.ofNullable(passengers.get(id));
    }

    @Override
    public Passenger createPassenger(Passenger passenger) {
        passenger.setId(idCounter++);
        passengers.put(passenger.getId(), passenger);
        return passenger;
    }

    @Override
    public Passenger updatePassenger(Long id, Passenger passenger) {
        passenger.setId(id);
        passengers.put(id, passenger);
        return passenger;
    }

    @Override
    public void deletePassenger(Long id) {
        passengers.remove(id);
    }
}