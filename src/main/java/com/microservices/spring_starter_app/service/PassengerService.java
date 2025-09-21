package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.Passenger;
import java.util.List;
import java.util.Optional;

public interface PassengerService {
    List<Passenger> getAllPassengers();
    Optional<Passenger> getPassengerById(Long id);
    Passenger createPassenger(Passenger passenger);
    Passenger updatePassenger(Long id, Passenger passenger);
    void deletePassenger(Long id);
}
