package com.example.demo.personne;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Personnes")
public class PersonneController {
	private final PersonneService personneService;

	private PersonneController(PersonneService personneService) {
		this.personneService=personneService;
	}

	@GetMapping
	public List<Personne> getAllPersonnes() {
		return personneService.getAllPersonnes();
	}

	@GetMapping("/{id}")
	public Optional<Personne> getPersonne(@PathVariable Long id) {
		return personneService.getPersonne(id);
	}

	@PostMapping
	public void register(@RequestBody Personne p) {
		personneService.createPersonne(p);
	}

}