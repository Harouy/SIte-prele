package com.example.demo.Prél;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Produit {
@Id
@GeneratedValue
@Column
private Long idproduit;
private String Categorie;
private String Nom;
@OneToMany(targetEntity=Prélévement.class,cascade=CascadeType.ALL)
@JoinColumn(name="idprel",referencedColumnName="idprel")
private List<Long> prel;
public Produit() {
	
}

}
