package com.stock.Model;

import java.util.List;
import java.util.stream.Collectors;

import com.stock.entity.User;

public class UserDTO {
	private Long userId;
    private String userName;
    private int age;
    private double userAssets;
    private StockDTO boughtStocks;
    private List<StockDTO> soldStocks; // Assuming this can be a list

    // Constructor
    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.age = user.getAge();
        this.userAssets = user.getUserAssets();
        
        // Assume boughtStocks are fetched from a method or repository
        if (!user.getBoughtStocks().isEmpty()) {
            // Get the first bought stock for simplicity
            this.boughtStocks = new StockDTO(user.getBoughtStocks().iterator().next());
        }
        
        this.soldStocks = user.getSoldStocks()
                .stream()
                .map(StockDTO::new)
                .collect(Collectors.toList());
    }
    public UserDTO() {
    }
    
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getUserAssets() {
		return userAssets;
	}
	public void setUserAssets(double userAssets) {
		this.userAssets = userAssets;
	}
	public StockDTO getBoughtStocks() {
		return boughtStocks;
	}
	public void setBoughtStocks(StockDTO boughtStocks) {
		this.boughtStocks = boughtStocks;
	}
	public List<StockDTO> getSoldStocks() {
		return soldStocks;
	}
	public void setSoldStocks(List<StockDTO> soldStocks) {
		this.soldStocks = soldStocks;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", age=" + age + ", userAssets=" + userAssets
				+ ", boughtStocks=" + boughtStocks + ", soldStocks=" + soldStocks + "]";
	}
	    
}
