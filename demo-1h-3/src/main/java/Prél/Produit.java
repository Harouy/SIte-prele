package Prél;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Produit {
@Id
@GeneratedValue
private Long id_produit;
private String Categorie;
private String Nom;
@OneToMany(targetEntity=Prélévement.class,cascade=CascadeType.ALL)
@JoinColumn(name="idprel",referencedColumnName="idprel")
private List<Long> id_prel;
public Produit() {
	
}
public Produit( String categorie, String nom, List<Long> id_prel) {
	super();
	
	Categorie = categorie;
	Nom = nom;
	this.id_prel = id_prel;
}
public Long getId_produit() {
	return id_produit;
}
public void setId_produit(Long id_produit) {
	this.id_produit = id_produit;
}
public String getCategorie() {
	return Categorie;
}
public void setCategorie(String categorie) {
	Categorie = categorie;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public List<Long> getId_prel() {
	return id_prel;
}
public void setId_prel(List<Long> id_prel) {
	this.id_prel = id_prel;
}
@Override
public int hashCode() {
	return Objects.hash(Categorie, Nom, id_prel, id_produit);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produit other = (Produit) obj;
	return Objects.equals(Categorie, other.Categorie) && Objects.equals(Nom, other.Nom)
			&& Objects.equals(id_prel, other.id_prel) && Objects.equals(id_produit, other.id_produit);
}

}
