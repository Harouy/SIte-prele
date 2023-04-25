package com.example.demo.personne;



import java.util.List;

import com.example.demo.Prél.Prelevement;
import com.example.demo.Prél.ResultatPrel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private TypePersonne type;
	@OneToMany(mappedBy = "personne")
	private List<Prelevement> prelevements;
	@OneToMany(mappedBy = "personne")
	private List<ResultatPrel> resultatPrels;
	/*@OneToMany(targetEntity=com.example.demo.Prél.Prélévement.class,cascade=CascadeType.ALL)
	@JoinColumn(name="idprel",referencedColumnName="idprel")
	private List<Long> prélévements;
	@OneToMany(targetEntity=com.example.demo.Prél.Résultat_prél.class,cascade=CascadeType.ALL)
	@JoinColumn(name="idrésultat",referencedColumnName="idrésultat")
	private List<Long> résultats;*/

}

