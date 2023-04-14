package com.vmcompany.product;

public enum Product {
	WATERBOTTLE(1, "Water Bottle", 300), PEPSI(2, "Pepsi", 550), FRIEDPOTATO(3, "Fried Potato", 700), TISSUE(4, "Tissue", 150);
	
	private int productID;
	private String productName;
	private int productPrice;
	
	private Product(int productID, String productName, int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
}
