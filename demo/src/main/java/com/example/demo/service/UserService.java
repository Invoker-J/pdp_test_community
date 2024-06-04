package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentContent;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService implements BaseService<User, UUID> {
    private final UserRepo userRepo;
    private final AttachmentService attachmentService;
    private final AttachmentContentService attachmentContentService;

    @Override
    public Optional<User> findById(UUID id) {
        return userRepo.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(UUID uuid) {
        userRepo.deleteById(uuid);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User update(User user, UUID uuid) {
        user.setId(uuid);
        return userRepo.save(user);
    }

    public ResponseEntity<?> setFileToUser(UUID userId, MultipartFile file) {
        if (!file.isEmpty()) {
            Optional<User> userOptional = findById(userId);
            if (userOptional.isPresent()) {
                try {
                    User user = userOptional.get();
                    user.setId(userId);

                    Attachment attachment = new Attachment();
                    attachment.setName(file.getOriginalFilename());
                    attachment.setSize((int) file.getSize());
                    attachmentService.save(attachment);
                    user.setAttachment(attachment);
                    update(user, userId);

                    AttachmentContent attachmentContent = new AttachmentContent();
                    attachmentContent.setAttachment(attachment);

                    attachmentContent.setContent(file.getInputStream().readAllBytes());
                    attachmentContent.setContentType(file.getContentType());
                    attachmentContentService.save(attachmentContent);
                    return ResponseEntity.ok().body(user);
                } catch (IOException e) {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }
            }
        }
        return ResponseEntity.badRequest().body(IllegalArgumentException.class);
    }
}
