package com.example.demo.repo;

import com.example.demo.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnswerRepo extends JpaRepository<Answer, UUID> {
}
