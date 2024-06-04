package com.example.demo.service;

import com.example.demo.entity.Answer;
import com.example.demo.repo.AnswerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnswerService implements BaseService<Answer, UUID> {
    private final AnswerRepo answerRepo;

    @Override
    public Optional<Answer> findById(UUID id) {
        return answerRepo.findById(id);
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepo.save(answer);
    }

    @Override
    public void delete(UUID uuid) {
        answerRepo.deleteById(uuid);
    }

    @Override
    public List<Answer> findAll() {
        return answerRepo.findAll();
    }

    @Override
    public Answer update(Answer answer, UUID uuid) {
        return answerRepo.save(answer);
    }
}