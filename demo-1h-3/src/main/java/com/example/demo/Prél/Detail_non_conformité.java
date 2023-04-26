package com.example.demo.Prél;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Detail_non_conformité {
@Id
@GeneratedValue
private Long idconfo;
private String Date_TA;
private String Numéro_TA;
private String Détail;
@OneToOne
private Résultat_prél resultatPrel;
public Detail_non_conformité() {
	
}

}