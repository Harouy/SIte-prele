package com.example.demo.Prél;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrélevementRepository extends JpaRepository<Prélévement,Long>{
	

}
