package com.microservices.spring_starter_app.exception;

public class PassengerAlreadyExistsException extends RuntimeException {
    public PassengerAlreadyExistsException(String passportNumber) {
        super("Passenger already exists with passport number: " + passportNumber);
    }
}
