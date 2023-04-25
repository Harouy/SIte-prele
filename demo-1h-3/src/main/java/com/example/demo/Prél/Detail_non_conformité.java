package com.example.demo.Prél;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Detail_non_conformité {
@Id
@GeneratedValue
private Long idconfo;
private String Date_TA;
private String Numéro_TA;
private String Détail;
@OneToOne(targetEntity=Résultat_prél.class,cascade=CascadeType.ALL)
@JoinColumn(name="idrésultat",referencedColumnName="idrésultat")
private Long résultatprel;
public Detail_non_conformité() {
	
}
public Detail_non_conformité( String date_TA, String numéro_TA, String détail, Long résultatprel) {
	super();
	
	Date_TA = date_TA;
	Numéro_TA = numéro_TA;
	Détail = détail;
	this.résultatprel = résultatprel;
}
public Long getIdconfo() {
	return idconfo;
}
public void setIdconfo(Long idconfo) {
	this.idconfo = idconfo;
}
public String getDate_TA() {
	return Date_TA;
}
public void setDate_TA(String date_TA) {
	Date_TA = date_TA;
}
public String getNuméro_TA() {
	return Numéro_TA;
}
public void setNuméro_TA(String numéro_TA) {
	Numéro_TA = numéro_TA;
}
public String getDétail() {
	return Détail;
}
public void setDétail(String détail) {
	Détail = détail;
}
public Long getRésultatprel() {
	return résultatprel;
}
public void setRésultatprel(Long résultatprel) {
	this.résultatprel = résultatprel;
}
@Override
public int hashCode() {
	return Objects.hash(Date_TA, Détail, Numéro_TA, idconfo, résultatprel);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Detail_non_conformité other = (Detail_non_conformité) obj;
	return Objects.equals(Date_TA, other.Date_TA) && Objects.equals(Détail, other.Détail)
			&& Objects.equals(Numéro_TA, other.Numéro_TA) && Objects.equals(idconfo, other.idconfo)
			&& Objects.equals(résultatprel, other.résultatprel);
}


}
