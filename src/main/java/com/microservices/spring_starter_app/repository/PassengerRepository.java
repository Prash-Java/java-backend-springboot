package com.microservices.spring_starter_app.repository;

import com.microservices.spring_starter_app.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    List<Passenger> findByName(String name);
    Passenger findByPassportNumber(String passportNumber);
}
