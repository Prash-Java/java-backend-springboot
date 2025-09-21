package com.microservices.spring_starter_app.service;

import com.microservices.spring_starter_app.entity.User;
import com.microservices.spring_starter_app.service.UserService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private final Map<Long, User> users = new HashMap<>();
    private long idCounter = 1;

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public User createUser(User user) {
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateUser(Long id, User user) {
        user.setId(id);
        users.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        users.remove(id);
    }
}
