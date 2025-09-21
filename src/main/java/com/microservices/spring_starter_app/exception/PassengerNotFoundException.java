package com.microservices.spring_starter_app.exception;

public class PassengerNotFoundException extends RuntimeException {
    public PassengerNotFoundException(Long id) {
        super("Passenger not found with id: " + id);
    }
}
