package com.example.demo.Prél;

import java.util.Objects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class DetailNonConformite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dateTA;
    private String numeroTA;
    private String detail;
    @OneToOne
    private ResultatPrel resultatPrel;
   /* @OneToOne(targetEntity=Resultat_prel.class,cascade=CascadeType.ALL)
    @JoinColumn(name="idrésultat",referencedColumnName="idrésultat")
    private Long résultatprel;*/
}
