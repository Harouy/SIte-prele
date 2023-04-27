package com.example.demo.controllers;

import com.example.demo.entities.ResultatPrelevement;
import com.example.demo.services.ResultatPrelevementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("/resultatPrelevement")
public class ResultatPrelevementController {
    private final ResultatPrelevementService resultatPrelevementService;

    @GetMapping
    public List<ResultatPrelevement> getAllPrelevement() {
        return resultatPrelevementService.getAllResultatPrelevement();
    }

    @GetMapping("/{id}")
    public ResultatPrelevement getPrelevement(@PathVariable Long id) {
        return 	resultatPrelevementService.getResultatPrelevement(id);

    }
    @PostMapping
    public void register( @RequestBody ResultatPrelevement resultatPrelevement) {
        resultatPrelevementService.saveResultatPrelevement(resultatPrelevement);
    }

}
