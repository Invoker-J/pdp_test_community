package com.example.demo.service;

import com.example.demo.entity.Theme;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ThemeService implements BaseService<Theme, UUID> {

    @Override
    public Optional<Theme> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Theme save(Theme theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Theme> findAll() {
        return List.of();
    }

    @Override
    public Theme update(Theme theme, UUID uuid) {
        return null;
    }
}
