package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.Theme;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RoleService implements BaseService<Role, UUID> {

    @Override
    public Optional<Role> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Role save(Role theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role update(Role theme, UUID uuid) {
        return null;
    }
}
