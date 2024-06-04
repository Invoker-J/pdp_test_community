package com.example.demo.service;

import com.example.demo.entity.ItLanguage;
import com.example.demo.entity.Question;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class ItLanguageService  implements BaseService<ItLanguage, UUID> {
    @Override
    public Optional<ItLanguage> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public ItLanguage save(ItLanguage itLanguage) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<ItLanguage> findAll() {
        return List.of();
    }

    @Override
    public ItLanguage update(ItLanguage itLanguage, UUID uuid) {
        return null;
    }
}
