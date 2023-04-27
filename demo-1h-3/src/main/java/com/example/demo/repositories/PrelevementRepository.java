package com.example.demo.repositories;

import com.example.demo.entities.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrelevementRepository extends JpaRepository<Prelevement, Long> {
}
