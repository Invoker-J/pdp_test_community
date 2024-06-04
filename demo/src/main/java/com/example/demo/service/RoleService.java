package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.Theme;
import com.example.demo.repo.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleService implements BaseService<Role, Integer> {
    private final RoleRepo roleRepo;

    @Override
    public Optional<Role> findById(Integer id) {
        return roleRepo.findById(id);
    }

    @Override
    public Role save(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void delete(Integer id) {
        roleRepo.deleteById(id);
    }

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Role update(Role role, Integer id) {
        role.setId(id);
        return roleRepo.save(role);
    }
}
