package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.DetailFacture;
import com.example.testspringun.Entity.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepo extends JpaRepository<DetailProduit,Long> {
}
