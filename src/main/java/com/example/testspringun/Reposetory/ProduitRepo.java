package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.DetailFacture;
import com.example.testspringun.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
