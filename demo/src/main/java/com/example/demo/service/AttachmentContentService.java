package com.example.demo.service;

import com.example.demo.entity.AttachmentContent;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AttachmentContentService implements BaseService<AttachmentContent, UUID> {

    @Override
    public Optional<AttachmentContent> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public AttachmentContent save(AttachmentContent theme) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<AttachmentContent> findAll() {
        return List.of();
    }

    @Override
    public AttachmentContent update(AttachmentContent theme, UUID uuid) {
        return null;
    }
}
