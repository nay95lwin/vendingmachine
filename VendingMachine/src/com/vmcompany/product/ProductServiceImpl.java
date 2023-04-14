package com.vmcompany.product;

import com.vmcompany.DefaultValue;

public class ProductServiceImpl implements ProductService {
	
	/*
	 * get the product by ID.
	 */
	@Override
	public Product getProductByID(int productID) {
		for (Product product : Product.values()) {
			if(productID == product.getProductID())
				return product;
		}
		
		return null;
	}

	/*
	 * display all product list
	 */
	@Override
	public void displayAllProductList() {
		for (Product product : Product.values()) {
			System.out.println(product.getProductID() + ". " + product.getProductName() + "\t\s" + product.getProductPrice() + DefaultValue.CASHUNIT.getDefaultUnit().getUnit());
		}
	}

	/*
	 * display product list by customer's balance.
	 */
	@Override
	public void displayProductListByBalance(int balance) {
		for (Product product : Product.values()) {
			if(balance >= product.getProductPrice())
				System.out.println(product.getProductID() + ". " + product.getProductName() + "\t\s" + product.getProductPrice() + DefaultValue.CASHUNIT.getDefaultUnit().getUnit());
		}
	}

	/*
	 * validate the purchase product exists or not.
	 */
	@Override
	public boolean validatePurchaseProduct(int purchaseProductID) {
		for (Product product : Product.values()) {
			if(purchaseProductID == product.getProductID())
				return true;
		}

		return false;
	}
	
}
