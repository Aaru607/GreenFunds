package com.stock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;

    private String stockName;

    private Double price;

    private Integer quantity;

    private String ownerName;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "userId")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "userId")
    private User seller;

    // Constructors
    public Stock() {
    }

    public Stock(String stockName, Double price, Integer quantity, String ownerName, User buyer, User seller) {
        this.stockName = stockName;
        this.price = price;
        this.quantity = quantity;
        this.ownerName = ownerName;
        this.buyer = buyer;
        this.seller = seller;
    }

    // Getters and Setters
    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}

