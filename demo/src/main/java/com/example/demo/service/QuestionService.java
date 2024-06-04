package com.example.demo.service;

import com.example.demo.entity.Question;
import com.example.demo.entity.Role;
import com.example.demo.repo.QuestionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QuestionService implements BaseService<Question, UUID> {
    private final QuestionRepo questionRepo;

    @Override
    public Optional<Question> findById(UUID id) {
        return questionRepo.findById(id);
    }

    @Override
    public Question save(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public void delete(UUID uuid) {
        questionRepo.deleteById(uuid);
    }

    @Override
    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    @Override
    public Question update(Question question, UUID uuid) {
        question.setId(uuid);
        return save(question);
    }
}
