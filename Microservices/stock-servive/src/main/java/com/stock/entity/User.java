package com.stock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private Integer age;
    private Double userAssets;

    @OneToMany(mappedBy = "buyer")
    private List<Stock> boughtStocks;

    @OneToMany(mappedBy = "seller")
    private List<Stock> soldStocks;

    // Constructors
    public User() {
    }

    public User(String userName, Integer age, Double userAssets) {
        this.userName = userName;
        this.age = age;
        this.userAssets = userAssets;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getUserAssets() {
        return userAssets;
    }

    public void setUserAssets(Double userAssets) {
        this.userAssets = userAssets;
    }

    public List<Stock> getBoughtStocks() {
        return boughtStocks;
    }

    public void setBoughtStocks(List<Stock> boughtStocks) {
        this.boughtStocks = boughtStocks;
    }

    public List<Stock> getSoldStocks() {
        return soldStocks;
    }

    public void setSoldStocks(List<Stock> soldStocks) {
        this.soldStocks = soldStocks;
    }
}
