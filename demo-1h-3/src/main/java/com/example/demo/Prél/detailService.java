package com.example.demo.Prél;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class detailService {
private final DetailRepository repo;
@Autowired
public detailService(DetailRepository repo) {
	this.repo=repo;
	
}
public void addprel(Detail_non_conformité detail) {
	if(repo.findById(detail.getIdconfo())!=null) {
		throw new IllegalArgumentException("Ce détail est éjà enregistré");
	}
	else {
		repo.save(detail);
	}
}
public Optional<Detail_non_conformité> getprel(Long id) {
if(repo.findById(id)==null) {
	throw new IllegalArgumentException("Ce détail n'existe pas");

}
else {
	return repo.findById(id);
}
}





public List<Detail_non_conformité> getAll() {
// TODO Auto-generated method stub
return repo.findAll();
}
}
