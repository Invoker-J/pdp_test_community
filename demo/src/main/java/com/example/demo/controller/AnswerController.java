package com.example.demo.controller;

import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/answers")
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;

    @GetMapping("/all-answers")
    public ResponseEntity<?> getAllAnswers() {
        List<Answer> answers = answerService.findAll();
        return ResponseEntity.ok(answers);
    }

    @PostMapping("/settings/answer")
    public ResponseEntity<?> setAnswer(@RequestBody Answer answer, @RequestParam(name = "questionId") UUID questionId) {
        Optional<Question> optionalQuestion = questionService.findById(questionId);
        if (optionalQuestion.isPresent()) {
            Question question = optionalQuestion.get();
            answer.setQuestion(question);
            return ResponseEntity.status(HttpStatus.CREATED).body(answerService.save(answer));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ChangeSetPersister.NotFoundException.class);
    }

}
