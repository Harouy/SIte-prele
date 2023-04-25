package com.example.demo.personne;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {
	private final PersonneRepository personneRepository;

	public PersonneService(PersonneRepository personneRepository) {
			this.personneRepository=personneRepository;
	}

	public void createPersonne(Personne p) {
		if(personneRepository.findById(p.getId()) != null) {
			throw new IllegalArgumentException("Ce compte existe déjà");
		}
		else {
			personneRepository.save(p);
		}
	}

	public List<Personne> getAllPersonnes() {
		return personneRepository.findAll();
	}

	public Optional<Personne> getPersonne(Long id) {
		return personneRepository.findById(id);
	}


	}


