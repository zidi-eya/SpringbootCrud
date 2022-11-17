package com.example.testspringun.Services;

import com.example.testspringun.Entity.Client;
import com.example.testspringun.Entity.Fournisseur;
import com.example.testspringun.Entity.Produit;
import com.example.testspringun.Reposetory.FournisseurRepo;
import com.example.testspringun.Reposetory.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFournisseurImp implements  IFournisseur {
@Autowired
    FournisseurRepo fournisseurRepo;

@Autowired
    ProduitRepo produitRepo;
    @Override
    public List<Fournisseur> retrieveAllFournisseur() {
        return fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepo.save(f);
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurRepo.deleteById(id);

    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepo.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepo.findById(id).orElse(null);
    }
    public void assignFournisseurToProduit(Long Idfournisseur, Long Idproduit) {
        Fournisseur fournisseur=fournisseurRepo.findById(Idfournisseur).orElse(null);
        Produit produit=produitRepo.findById(Idproduit).orElse(null);
        if (fournisseur!=null && produit!=null){
            // fournisseurRepo.getone(Idfournisseur).get().getEtudiant().add(getone(Idproduit).get());
            //System.out.println("second");
            //fournisseurRepository.save(getone(Idproduit).get());

        }}
}
