package com.example.testspringun.Services;

import com.example.testspringun.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProduit   {

  public   List<Produit> retrieveAllProduits();

   public Produit addProduit(Produit p, Long idRayon, Long idStock);

   public Produit retrieveProduit(Long id);
}
