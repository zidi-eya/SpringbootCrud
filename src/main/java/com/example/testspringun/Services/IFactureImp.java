package com.example.testspringun.Services;

import com.example.testspringun.Entity.Facture;
import com.example.testspringun.Reposetory.FactureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFactureImp implements IFacture{
    @Autowired
    FactureRepo factureRepo;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepo.findAll();
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepo.findById(id).orElse(null);
    }
}
