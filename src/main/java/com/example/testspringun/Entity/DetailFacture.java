package com.example.testspringun.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qte;
    private Float prixtotal;
    private Integer pourcentageRemise ;
    private Integer montantRemise;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Produit produit;


}
