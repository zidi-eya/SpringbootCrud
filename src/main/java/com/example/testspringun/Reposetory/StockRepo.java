package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.DetailFacture;
import com.example.testspringun.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock,Long> {
}
