package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.Booking;
import com.microservices.spring_starter_app.service.BookingService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookingServiceImpl implements BookingService {
    private final Map<Long, Booking> bookings = new HashMap<>();
    private long idCounter = 1;

    @Override
    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }

    @Override
    public Optional<Booking> getBookingById(Long id) {
        return Optional.ofNullable(bookings.get(id));
    }

    @Override
    public Booking createBooking(Booking booking) {
        booking.setId(idCounter++);
        bookings.put(booking.getId(), booking);
        return booking;
    }

    @Override
    public Booking updateBooking(Long id, Booking booking) {
        booking.setId(id);
        bookings.put(id, booking);
        return booking;
    }

    @Override
    public void deleteBooking(Long id) {
        bookings.remove(id);
    }
}
