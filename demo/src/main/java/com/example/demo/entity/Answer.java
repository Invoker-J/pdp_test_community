package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Answer {
    @Id
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    private UUID id;
    private String text;
    @ManyToOne
    private Question question;

}
