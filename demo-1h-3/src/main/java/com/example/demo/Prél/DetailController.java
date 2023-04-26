package com.example.demo.Prél;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Detail")
public class DetailController {
	private final detailService service;
	@Autowired
	public DetailController(detailService service) {
		this.service=service;
	}
	@GetMapping
	public List<Detail_non_conformité> getALL() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Object getprel(@PathVariable Long id) {
	return 	service.getprel(id);
		
	}
	@PostMapping
	public void register( @RequestBody Detail_non_conformité detail ) {
		service.addprel(detail);
	}


	}


