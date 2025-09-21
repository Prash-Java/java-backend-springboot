package com.microservices.spring_starter_app.repository;

import com.microservices.spring_starter_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
    User findByUsername(String username);
    User findByEmail(String email);
}
