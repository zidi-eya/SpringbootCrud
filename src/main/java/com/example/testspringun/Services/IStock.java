package com.example.testspringun.Services;

import com.example.testspringun.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStock {
   public List<Stock> retrieveAllStocks();

   public Stock addStock(Stock s);

   public Stock updateStock(Stock u);

   public Stock retrieveStock(Long id);
}
