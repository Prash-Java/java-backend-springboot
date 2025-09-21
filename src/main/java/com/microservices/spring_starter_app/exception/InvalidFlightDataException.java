package com.microservices.spring_starter_app.exception;

public class InvalidFlightDataException extends RuntimeException {
    public InvalidFlightDataException(String message) {
        super(message);
    }
}
