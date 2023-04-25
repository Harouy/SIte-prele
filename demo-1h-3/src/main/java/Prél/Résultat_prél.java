package Prél;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Résultat_prél {
@Id
@GeneratedValue
private Long idrésultat;
private String dateBA;
private int numéro_BA;
private Boolean Conformité;

}
