package com.example.testspringun.Services;

import com.example.testspringun.Entity.Produit;
import com.example.testspringun.Reposetory.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProduitImp implements IProduit {
    @Autowired
    ProduitRepo produitRepo;
    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return produitRepo.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepo.findById(id).orElse(null);
    }
}
