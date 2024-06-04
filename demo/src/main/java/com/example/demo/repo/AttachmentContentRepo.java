package com.example.demo.repo;

import com.example.demo.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentContentRepo extends JpaRepository<AttachmentContent, UUID> {

}
