package com.example.demo.services;

import com.example.demo.entities.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {
    void savePersonne(Personne p);
    Personne getPersonne(Long id);
    List<Personne> getAllPersonnes();
}
