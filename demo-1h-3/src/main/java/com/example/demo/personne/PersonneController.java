package com.example.demo.personne;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Prél.Prélévement;



@RestController
@RequestMapping("/Personnes")
public class PersonneController {
private final PersonneService Service;
@Autowired
private PersonneController(PersonneService Service) {
	this.Service=Service;
	
}


@GetMapping
public List<Personne> getAllPersonnes() {
	return Service.getAllPersonnes();
}
@GetMapping("/{id}")
public Object getperso(@PathVariable Long id) {
return 	Service.getpersonne(id) ;
	
}
@PostMapping
public void register( @RequestBody Personne p) {
	Service.create(p);;
}
}