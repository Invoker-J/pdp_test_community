package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Attachment {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    private UUID id;
    @NotBlank
    private String name;
    private Integer size;
}
