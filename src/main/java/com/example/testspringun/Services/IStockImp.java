package com.example.testspringun.Services;

import com.example.testspringun.Entity.Stock;
import com.example.testspringun.Reposetory.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStockImp implements IStock {
    @Autowired
    StockRepo stockRepo ;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepo.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepo.findById(id).orElse(null);
    }
}
