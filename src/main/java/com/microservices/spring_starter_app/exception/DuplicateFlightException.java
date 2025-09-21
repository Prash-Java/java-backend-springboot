package com.microservices.spring_starter_app.exception;

public class DuplicateFlightException extends RuntimeException {
    public DuplicateFlightException(String message) {
        super(message);
    }
}
