package com.stock.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.Model.StockDTO;
import com.stock.entity.Stock;
import com.stock.repo.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<StockDTO> getAllStocks() {
        return stockRepository.findAll()
                .stream()
                .map(StockDTO::new)
                .collect(Collectors.toList());
    }

    public Optional<Stock> getStockById(Long stockId) {
        return stockRepository.findById(stockId);
    }

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(Long stockId) {
        stockRepository.deleteById(stockId);
    }
}

