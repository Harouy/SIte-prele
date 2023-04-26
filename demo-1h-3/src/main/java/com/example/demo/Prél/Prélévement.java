package com.example.demo.Prél;

import java.util.List;
import java.util.Objects;

import com.example.demo.personne.Personne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Prélévement {
	@Id
	@GeneratedValue
	@Column
	private Long idprel;
	private String date_envoi;
	private cadre cadre_controle;
	private String date_prel;
	private int code_controle;
	private Labo labo_desti;
	private Niveau Niveau_prel;
	private int Numero_proc;
	private String Suivi_etat;
	private type type_prel;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Personne personne;
	@OneToOne
	private Résultat_prél resultatPrel;

	
	public Prélévement() {
		
	}
	

}