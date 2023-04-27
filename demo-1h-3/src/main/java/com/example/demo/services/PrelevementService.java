package com.example.demo.services;

import com.example.demo.entities.Prelevement;

import java.util.List;
import java.util.Optional;

public interface PrelevementService {
    void savePrelevement(Prelevement prelevement);
    Prelevement getPrelevement(Long id);
    void deletePrelevement(long id);
    List<Prelevement> getAllPrelevement();
}
