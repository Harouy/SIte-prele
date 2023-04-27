package com.example.demo.services;

import com.example.demo.entities.Personne;
import com.example.demo.repositories.PersonneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl implements PersonneService{
    private final PersonneRepository personneRepository;


    @Override
    public void savePersonne(Personne p) {
        if(personneRepository.findById(p.getId())!=null) {
            throw new IllegalArgumentException("Ce compte existe déjà");
        }
        else {
            personneRepository.save(p);
        }
    }

    @Override
    public Personne getPersonne(Long id) {
        return personneRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ce compte n'existe pas"));
    }

    @Override
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }
}
