package com.example.demo.Prél;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue
    private Long id;
    private String categorie;
    private String nom;
    @OneToMany
    private List<Prelevement> prelevement;
    /*@OneToMany(targetEntity=Prélévement.class,cascade=CascadeType.ALL)
    @JoinColumn(name="idprel",referencedColumnName="idprel")
    private List<Long> prel;*/
}
