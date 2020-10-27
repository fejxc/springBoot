package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    void save(User user);

    void update(User user);

    void delete(String id);

    List<User> findAll();

    User findById(String id);
}
