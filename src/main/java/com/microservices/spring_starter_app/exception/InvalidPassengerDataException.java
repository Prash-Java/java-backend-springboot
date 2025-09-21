package com.microservices.spring_starter_app.exception;

public class InvalidPassengerDataException extends RuntimeException {
    public InvalidPassengerDataException(String message) {
        super(message);
    }
}
