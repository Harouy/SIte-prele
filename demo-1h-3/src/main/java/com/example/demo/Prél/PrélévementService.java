package com.example.demo.Prél;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.personne.Personne;

@Service
public class PrélévementService {
	private final PrélevementRepository repo;
	@Autowired
	public PrélévementService(PrélevementRepository repo) {
		this.repo=repo;
	}
	public void addprel(Prélévement prel) {
		if(repo.findById(prel.getIdprel())!=null) {
			throw new IllegalArgumentException("Ce prélévement est éjà enregistré");
		}
		else {
			repo.save(prel);
		}
	}
public Optional<Prélévement> getprel(Long id) {
	if(repo.findById(id)==null) {
		throw new IllegalArgumentException("Ce prélévement n'existe pas");
	
	}
	else {
		return repo.findById(id);
	}
}

	

public void Delete(long id) {
	if(repo.findById(id)==null) {
		throw new IllegalArgumentException("Ce prélévement n'existe pas");
	
	}
	else {
		repo.deleteById(id);;
	}
}
public List<Prélévement> getAll() {
	// TODO Auto-generated method stub
	return repo.findAll();
}
}
