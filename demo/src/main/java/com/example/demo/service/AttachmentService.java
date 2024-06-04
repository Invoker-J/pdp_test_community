package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.Question;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AttachmentService implements BaseService<Attachment, UUID> {

    @Override
    public Optional<Attachment> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Attachment save(Attachment theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Attachment> findAll() {
        return List.of();
    }

    @Override
    public Attachment update(Attachment theme, UUID uuid) {
        return null;
    }
}
