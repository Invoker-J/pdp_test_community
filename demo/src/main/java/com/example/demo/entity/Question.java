package com.example.demo.entity;

import com.example.demo.entity.enums.TypeLevel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Question {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    private UUID id;
    @NotBlank
    private String text;
    @Enumerated(EnumType.STRING)
    private TypeLevel typeLevel;
    @OneToOne
    private Attachment attachment;
    @ManyToMany
    private List<Answer> answers;
}
