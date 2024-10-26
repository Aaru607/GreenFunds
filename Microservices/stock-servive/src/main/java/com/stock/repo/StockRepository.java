package com.stock.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    // You can define custom query methods here if needed
}