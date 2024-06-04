package com.example.demo.service;

import com.example.demo.entity.Question;
import com.example.demo.entity.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class QuestionService implements BaseService<Question, UUID> {

    @Override
    public Optional<Question> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Question save(Question theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Question> findAll() {
        return List.of();
    }

    @Override
    public Question update(Question theme, UUID uuid) {
        return null;
    }
}
