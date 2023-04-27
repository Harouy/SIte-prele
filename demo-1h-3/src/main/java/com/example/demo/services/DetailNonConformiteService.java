package com.example.demo.services;

import com.example.demo.entities.DetailNonConformite;

import java.util.List;
import java.util.Optional;

public interface DetailNonConformiteService {
    void saveDetail(DetailNonConformite detail);
    DetailNonConformite getDetail(Long id);
    List<DetailNonConformite> getAllDetails();
}
