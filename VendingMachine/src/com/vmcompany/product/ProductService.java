package com.vmcompany.product;

public interface ProductService {
	public Product getProductByID(int productID);
	public void displayAllProductList();
	public void displayProductListByBalance(int balance);
	public boolean validatePurchaseProduct(int purchaseProductID);
}
