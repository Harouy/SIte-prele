package com.example.demo.Prél;

import com.example.demo.personne.Personne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Résultat_prél {
@Id
@GeneratedValue
@Column
private Long idrésultat;
private String dateBA;
private int numéro_BA;
private Boolean Conformité;
@ManyToOne
private Personne personne;
@OneToOne(mappedBy = "resultatPrel")
private Prélévement prelevement;
@OneToOne(mappedBy = "resultatPrel")
private Detail_non_conformité detailNonConformite;
}
