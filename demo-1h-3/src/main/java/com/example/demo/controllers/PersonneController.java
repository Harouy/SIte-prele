package com.example.demo.controllers;

import com.example.demo.entities.Personne;
import com.example.demo.services.PersonneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/personnes")
public class PersonneController {
    private final PersonneService personneService;

    @GetMapping
    public List<Personne> getAllPersonnes() {
        return personneService.getAllPersonnes();
    }
    @GetMapping("/{id}")
    public Object getPersonne(@PathVariable Long id) {
        return 	personneService.getPersonne(id) ;
    }
    @PostMapping
    public void register( @RequestBody Personne p) {
        personneService.savePersonne(p);
    }
}
