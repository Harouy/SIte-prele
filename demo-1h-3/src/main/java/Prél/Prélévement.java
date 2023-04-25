package Prél;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Prélévement {
	@Id
	@GeneratedValue
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
	public Prélévement() {
		
	}
	public Prélévement(String date_envoi, cadre cadre_controle, String date_prel, int code_controle, Labo labo_desti,
			Niveau niveau_prel, int numero_proc, String suivi_etat, type type_prel) {
		super();
		this.date_envoi = date_envoi;
		this.cadre_controle = cadre_controle;
		this.date_prel = date_prel;
		this.code_controle = code_controle;
		this.labo_desti = labo_desti;
		Niveau_prel = niveau_prel;
		Numero_proc = numero_proc;
		Suivi_etat = suivi_etat;
		this.type_prel = type_prel;
	}
	public Long getIdprel() {
		return idprel;
	}
	public void setIdprel(Long idprel) {
		this.idprel = idprel;
	}
	public String getDate_envoi() {
		return date_envoi;
	}
	public void setDate_envoi(String date_envoi) {
		this.date_envoi = date_envoi;
	}
	public cadre getCadre_controle() {
		return cadre_controle;
	}
	public void setCadre_controle(cadre cadre_controle) {
		this.cadre_controle = cadre_controle;
	}
	public String getDate_prel() {
		return date_prel;
	}
	public void setDate_prel(String date_prel) {
		this.date_prel = date_prel;
	}
	public int getCode_controle() {
		return code_controle;
	}
	public void setCode_controle(int code_controle) {
		this.code_controle = code_controle;
	}
	public Labo getLabo_desti() {
		return labo_desti;
	}
	public void setLabo_desti(Labo labo_desti) {
		this.labo_desti = labo_desti;
	}
	public Niveau getNiveau_prel() {
		return Niveau_prel;
	}
	public void setNiveau_prel(Niveau niveau_prel) {
		Niveau_prel = niveau_prel;
	}
	public int getNumero_proc() {
		return Numero_proc;
	}
	public void setNumero_proc(int numero_proc) {
		Numero_proc = numero_proc;
	}
	public String getSuivi_etat() {
		return Suivi_etat;
	}
	public void setSuivi_etat(String suivi_etat) {
		Suivi_etat = suivi_etat;
	}
	public type getType_prel() {
		return type_prel;
	}
	public void setType_prel(type type_prel) {
		this.type_prel = type_prel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Niveau_prel, Numero_proc, Suivi_etat, cadre_controle, code_controle, date_envoi, date_prel,
				idprel, labo_desti, type_prel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prélévement other = (Prélévement) obj;
		return Niveau_prel == other.Niveau_prel && Numero_proc == other.Numero_proc
				&& Objects.equals(Suivi_etat, other.Suivi_etat) && cadre_controle == other.cadre_controle
				&& code_controle == other.code_controle && Objects.equals(date_envoi, other.date_envoi)
				&& Objects.equals(date_prel, other.date_prel) && Objects.equals(idprel, other.idprel)
				&& labo_desti == other.labo_desti && type_prel == other.type_prel;
	}


}
