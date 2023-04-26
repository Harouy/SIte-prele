package com.example.demo.personne;



import java.util.List;
import java.util.Objects;

import com.example.demo.Prél.Prélévement;
import com.example.demo.Prél.Résultat_prél;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nom;
	private String Prenom;
	private String Email;
	private String mdp;
	private typepersonne type;
	@OneToMany(mappedBy = "personne")
	private List<Prélévement> prélévements;
	@OneToMany(mappedBy = "personne")
	private List<Résultat_prél> résultats;

	public Personne(String nom, String prenom, String email, String mdp, typepersonne type,
			List<Prélévement> prélévements, List<Résultat_prél> résultats) {
		super();
		Nom = nom;
		Prenom = prenom;
		Email = email;
		this.mdp = mdp;
		this.type = type;
		this.prélévements = prélévements;
		this.résultats = résultats;
	}
	
	
	

}

