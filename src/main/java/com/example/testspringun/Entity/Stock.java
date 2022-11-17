package com.example.testspringun.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stock implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idstock;
    private  Integer qteStock;
    private Integer qtemin;
    private String libellestock;



    @OneToMany(mappedBy = "stock")
    private List<Produit> produitList;

}
