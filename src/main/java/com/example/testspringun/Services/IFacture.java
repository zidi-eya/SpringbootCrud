package com.example.testspringun.Services;

import com.example.testspringun.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFacture {

    public List<Facture> retrieveAllFactures();
    public void cancelFacture(Long id);
    public Facture retrieveFacture(Long id);
}
