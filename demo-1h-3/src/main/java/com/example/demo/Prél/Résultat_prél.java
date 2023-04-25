package com.example.demo.Prél;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Résultat_prél {
@Id
@GeneratedValue
@Column
private Long idrésultat;
private String dateBA;
private int numéro_BA;
private Boolean Conformité;

}
