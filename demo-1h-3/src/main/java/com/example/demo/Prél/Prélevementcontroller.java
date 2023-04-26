package com.example.demo.Prél;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.personne.Personne;

@RestController
@RequestMapping("/Prélévements")
public class Prélevementcontroller {
private final PrélévementService service;
@Autowired
public Prélevementcontroller(PrélévementService service) {
	this.service=service;
}
@GetMapping
public List<Prélévement> getALL() {
	return service.getAll();
}

@GetMapping("/{id}")
public Object getprel(@PathVariable Long id) {
return 	service.getprel(id);
	
}
@PostMapping
public void register( @RequestBody Prélévement prel) {
	service.addprel(prel);
}


}
