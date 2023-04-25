package com.example.demo.Prél;

import java.util.Date;
import java.util.List;


import com.example.demo.personne.Personne;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Prelevement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateProcesVerbal;
	private int numeroProcesVerbal;
	private Type typePrel;
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
	private ResultatPrel resultatPrel;
}