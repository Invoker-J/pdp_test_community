package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/all-users")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/settings/save")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        User save = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PostMapping("/settings/upload-file")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file, @RequestParam(name = "userId") UUID userId) {
        return userService.setFileToUser(userId, file);
    }

    @PutMapping("/settings/user-edit")
    public ResponseEntity<?> editUser(@RequestBody User user, @RequestParam(name = "userId") UUID userId) {
        return ResponseEntity.ok().body(userService.update(user, userId));
    }

    @DeleteMapping("/settings/user/delete")
    public ResponseEntity<?> deleteUser(@RequestParam(name = "userId") UUID userId) {
        userService.delete(userId);
        return ResponseEntity.noContent().build();
    }
}
