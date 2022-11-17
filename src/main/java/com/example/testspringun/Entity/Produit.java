package com.example.testspringun.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produit implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproduit ;

    private String codeproduit;
    private String libelleproduit;
    private float prixUnitaire ;

    @ManyToMany
    private List<Fournisseur> fournisseurList;

    @ManyToOne
    private  Rayon rayon;

    @ManyToOne
    private  Stock stock;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactureList;

}
