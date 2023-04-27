package com.example.demo.controllers;

import com.example.demo.entities.DetailNonConformite;
import com.example.demo.services.DetailNonConformiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("detailNonConformite")
public class DetailNonConformiteController {
    private final DetailNonConformiteService detailNonConformiteService;

    @GetMapping
    public List<DetailNonConformite> getAllDetails() {
        return detailNonConformiteService.getAllDetails();
    }

    @GetMapping("/{id}")
    public Object getDetail(@PathVariable Long id) {
        return 	detailNonConformiteService.getDetail(id);

    }

    @PostMapping
    public void register( @RequestBody DetailNonConformite detail ) {
        detailNonConformiteService.saveDetail(detail);
    }

}
