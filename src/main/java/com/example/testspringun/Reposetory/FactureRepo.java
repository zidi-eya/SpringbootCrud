package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.DetailFacture;
import com.example.testspringun.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepo extends JpaRepository<Facture,Long> {
}
