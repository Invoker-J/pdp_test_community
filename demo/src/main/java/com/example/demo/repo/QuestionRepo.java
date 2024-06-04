package com.example.demo.repo;

import com.example.demo.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QuestionRepo extends JpaRepository<Question, UUID> {
}
