package com.example.demo.personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long>{

}