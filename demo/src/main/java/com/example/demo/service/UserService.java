package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserService implements BaseService<User, UUID> {
    @Override
    public Optional<User> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User update(User user, UUID uuid) {
        return null;
    }
}
