package com.example.demo.Prél;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DetailRepository extends JpaRepository<Detail_non_conformité,Long>{

}
