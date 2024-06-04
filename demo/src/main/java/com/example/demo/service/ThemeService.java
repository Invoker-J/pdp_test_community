package com.example.demo.service;

import com.example.demo.entity.Theme;
import com.example.demo.repo.ThemeRepo;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Setter
@RequiredArgsConstructor
public class ThemeService implements BaseService<Theme, UUID> {
    private final ThemeRepo themeRepo;

    @Override
    public Optional<Theme> findById(UUID id) {
        return themeRepo.findById(id);
    }

    @Override
    public Theme save(Theme theme) {
        return themeRepo.save(theme);
    }

    @Override
    public void delete(UUID uuid) {
        themeRepo.deleteById(uuid);
    }

    @Override
    public List<Theme> findAll() {
        return themeRepo.findAll();
    }

    @Override
    public Theme update(Theme theme, UUID uuid) {
        return themeRepo.save(theme);
    }
}
