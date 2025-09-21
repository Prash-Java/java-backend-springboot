package com.microservices.spring_starter_app.repository;

import com.microservices.spring_starter_app.entity.Booking;
import com.microservices.spring_starter_app.entity.User;
import com.microservices.spring_starter_app.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
    List<Booking> findByFlight(Flight flight);
}
