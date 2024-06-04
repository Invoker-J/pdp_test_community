package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentContent extends JpaRepository<AttachmentContent, UUID> {

}
