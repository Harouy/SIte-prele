package com.example.demo.controllers;

import com.example.demo.entities.Prelevement;
import com.example.demo.services.PrelevementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prelevement")
public class PrelevementController {
    private final PrelevementService prelevementSrevice;

    @GetMapping
    public List<Prelevement> getAllPrelevement() {
        return prelevementSrevice.getAllPrelevement();
    }

    @GetMapping("/{id}")
    public Prelevement getPrelevement(@PathVariable Long id) {
        return 	prelevementSrevice.getPrelevement(id);

    }
    @PostMapping
    public void register( @RequestBody Prelevement prelevement) {
        prelevementSrevice.savePrelevement(prelevement);
    }

}
