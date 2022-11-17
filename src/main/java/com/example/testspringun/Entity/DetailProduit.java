package com.example.testspringun.Entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailProduit implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailproduit ;
    @Temporal(value = TemporalType.DATE)
    private Date dateCreation;
    @Temporal(value = TemporalType.DATE)
    private Date datederniereModification;
    private CategorieProduit categorieProduit ;

    @OneToOne
    private  Produit produit;
}
