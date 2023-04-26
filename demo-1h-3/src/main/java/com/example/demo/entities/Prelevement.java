package com.example.demo.entities;

import com.example.demo.entities.utils.Cadre;
import com.example.demo.entities.utils.Labo;
import com.example.demo.entities.utils.Niveau;
import com.example.demo.entities.utils.TypePrelevement;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Prelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateProcesVerbal;
    private int numeroProcesVerbal;
    private TypePrelevement typePrelevement;
    private Cadre cadreControle;
    private Niveau niveauPrel;
    private Labo laboDestination;
    private Date dateEnvoie;
    private String etatAvancement;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Personne personne;
    @OneToOne
    private ResultatPrelevement resultatPrel;
}
