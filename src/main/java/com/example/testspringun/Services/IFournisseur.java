package com.example.testspringun.Services;

import com.example.testspringun.Entity.Client;
import com.example.testspringun.Entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFournisseur  {
    public List<Fournisseur> retrieveAllFournisseur ();

    public Fournisseur addFournisseur (Fournisseur  f);

    public void deleteFournisseur (Long id);

    public Fournisseur updateFournisseur (Fournisseur  f);

    public Fournisseur retrieveFournisseur (Long id);

    public void assignFournisseurToProduit(Long Idfournisseur, Long Idproduit) ;
}
