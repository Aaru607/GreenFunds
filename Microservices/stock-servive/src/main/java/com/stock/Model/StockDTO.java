package com.stock.Model;

import com.stock.entity.Stock;

public class StockDTO {
    private Long stockId;
    private String stockName;
    private double price;
    private int quantity;
    private String ownerName;

    // Include only necessary user fields
    private Long buyerId;
    private Long sellerId;

    // Constructor
    public StockDTO(Stock stock) {
        this.stockId = stock.getStockId();
        this.stockName = stock.getStockName();
        this.price = stock.getPrice();
        this.quantity = stock.getQuantity();
        this.ownerName = stock.getOwnerName();
        this.buyerId = stock.getBuyer() != null ? stock.getBuyer().getUserId() : null;
        this.sellerId = stock.getSeller() != null ? stock.getSeller().getUserId() : null;
    }
    public StockDTO() {
    }
    // Getters and setters
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Long getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "StockDTO [stockId=" + stockId + ", stockName=" + stockName + ", price=" + price + ", quantity="
				+ quantity + ", ownerName=" + ownerName + ", buyerId=" + buyerId + ", sellerId=" + sellerId + "]";
	}
    
    
}
