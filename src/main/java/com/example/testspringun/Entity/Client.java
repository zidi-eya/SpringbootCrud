package com.example.testspringun.Entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient ;
    private String nom;
    private String prenom;
    @Temporal(value = TemporalType.DATE)
    private Date dateNaissance;
    private String email ;
    private String password ;
    private CategorieClient categorieClient;
    private Profession profession;

    @OneToMany(mappedBy = "client")
    private List<Facture> factureList;

}
