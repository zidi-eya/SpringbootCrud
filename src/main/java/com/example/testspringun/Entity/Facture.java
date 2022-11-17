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
public class Facture implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture ;
    private Float montantremise;
    private Float montantfacture;
@Temporal(value = TemporalType.DATE)
private Date datefacture;

    private boolean active ;

    @ManyToOne()
    private Client client;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactureList;


}
