package com.example.demo.personne;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {
		private final PersonneRepository repo;
		@Autowired
		public PersonneService(PersonneRepository repo) {
			this.repo=repo;
		}
	public void create(Personne p) {
		if(repo.findById(p.getId())==null) {
			throw new IllegalArgumentException("Ce compte existe déjà");
		}
		else {
			repo.save(p);
		}
	}
	public Object getpersonne(Personne p) {
		if(repo.findById(p.getId())==null) {
			throw new IllegalArgumentException("Ce compte n'existe pas");
		}
		
		return repo.findById(p.getId());
	}


	}

