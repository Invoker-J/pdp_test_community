package com.example.demo.service;

import com.example.demo.entity.AttachmentContent;
import com.example.demo.repo.AttachmentContentRepo;
import com.example.demo.repo.AttachmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AttachmentContentService implements BaseService<AttachmentContent, UUID> {
    private final AttachmentContentRepo attachmentContentRepo;

    @Override
    public Optional<AttachmentContent> findById(UUID id) {
        return attachmentContentRepo.findById(id);
    }

    @Override
    public AttachmentContent save(AttachmentContent theme) {
        return attachmentContentRepo.save(theme);
    }

    @Override
    public void delete(UUID uuid) {
        attachmentContentRepo.deleteById(uuid);
    }

    @Override
    public List<AttachmentContent> findAll() {
        return attachmentContentRepo.findAll();
    }

    @Override
    public AttachmentContent update(AttachmentContent attachmentContent, UUID uuid) {
        attachmentContent.setId(uuid);
        return attachmentContentRepo.save(attachmentContent);
    }
}
