package Personne;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Personne {
	@Id
	@GeneratedValue
	private Long id;
	private String Nom;
	private String Prenom;
	private String Email;
	private String mdp;
	private typepersonne type;
	private List<Long> résultats;
	private List<Long> prélevements;
	public Personne() {
		
	}
	public Personne( String nom, String prenom, String email, String mdp, typepersonne type,
			List<Long> résultats, List<Long> prélevements) {
		super();
		
		Nom = nom;
		Prenom = prenom;
		Email = email;
		this.mdp = mdp;
		this.type = type;
		this.résultats = résultats;
		this.prélevements = prélevements;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public typepersonne getType() {
		return type;
	}
	public void setType(typepersonne type) {
		this.type = type;
	}
	public List<Long> getRésultats() {
		return résultats;
	}
	public void setRésultats(List<Long> résultats) {
		this.résultats = résultats;
	}
	public List<Long> getPrélevements() {
		return prélevements;
	}
	public void setPrélevements(List<Long> prélevements) {
		this.prélevements = prélevements;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, id, Nom, Prenom, mdp, prélevements, résultats, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(id, other.id) && Objects.equals(Nom, other.Nom)
				&& Objects.equals(Prenom, other.Prenom) && Objects.equals(mdp, other.mdp)
				&& Objects.equals(prélevements, other.prélevements) && Objects.equals(résultats, other.résultats)
				&& type == other.type;
	}
	
	

}
