package com.example.demo.service;

import com.example.demo.entity.Answer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AnswerService implements BaseService<Answer, UUID> {

    @Override
    public Optional<Answer> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Answer save(Answer theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Answer> findAll() {
        return List.of();
    }

    @Override
    public Answer update(Answer theme, UUID uuid) {
        return null;
    }
}