package com.example.demo.entities;

import com.example.demo.entities.utils.TypePersonne;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private TypePersonne type;
    @OneToMany(mappedBy = "personne")
    private List<Prelevement> prelevements;
    @OneToMany(mappedBy = "personne")
    private List<ResultatPrelevement> resultats;

    public Personne(String nom, String prenom, String email, String mdp,
                    TypePersonne type, List<Prelevement> prelevements,
                    List<ResultatPrelevement> resultats)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.type = type;
        this.prelevements = prelevements;
        this.resultats = resultats;
    }
}
