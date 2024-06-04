package com.example.demo.service;

import com.example.demo.entity.ItLanguage;
import com.example.demo.entity.Question;
import com.example.demo.repo.ItLanguageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ItLanguageService implements BaseService<ItLanguage, Integer> {
    private final ItLanguageRepo itLanguageRepo;

    @Override
    public Optional<ItLanguage> findById(Integer id) {
        return itLanguageRepo.findById(id);
    }

    @Override
    public ItLanguage save(ItLanguage itLanguage) {
        return itLanguageRepo.save(itLanguage);
    }

    @Override
    public void delete(Integer uuid) {
        itLanguageRepo.deleteById(uuid);
    }

    @Override
    public List<ItLanguage> findAll() {
        return itLanguageRepo.findAll();
    }

    @Override
    public ItLanguage update(ItLanguage itLanguage, Integer uuid) {
        itLanguage.setId(uuid);
        return itLanguageRepo.save(itLanguage);
    }
}
