package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.Question;
import com.example.demo.repo.AttachmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AttachmentService implements BaseService<Attachment, UUID> {
    private final AttachmentRepo attachmentRepo;

    @Override
    public Optional<Attachment> findById(UUID id) {
        return attachmentRepo.findById(id);
    }

    @Override
    public Attachment save(Attachment theme) {
        return attachmentRepo.save(theme);
    }

    @Override
    public void delete(UUID uuid) {
        attachmentRepo.deleteById(uuid);
    }

    @Override
    public List<Attachment> findAll() {
        return attachmentRepo.findAll();
    }

    @Override
    public Attachment update(Attachment attachment, UUID uuid) {
        attachment.setId(uuid);
        return attachmentRepo.save(attachment);
    }
}
