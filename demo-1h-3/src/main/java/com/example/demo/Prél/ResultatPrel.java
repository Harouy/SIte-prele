package com.example.demo.Prél;

import com.example.demo.personne.Personne;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class ResultatPrel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateBA;
    private int numeroBA;
    private Boolean conforme;
    @ManyToOne
    private Personne personne;
    @OneToOne(mappedBy = "resultatPrel")
    private Prelevement prelevement;
    @OneToOne(mappedBy = "resultatPrel")
    private DetailNonConformite detailNonConformite;
}
