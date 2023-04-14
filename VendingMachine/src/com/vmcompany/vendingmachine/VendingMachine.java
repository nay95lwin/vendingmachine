package com.vmcompany.vendingmachine;

import java.util.Scanner;

import com.vmcompany.product.ProductServiceImpl;

public interface VendingMachine {
	public int getCashIn(Scanner scan);
	public int getPurchaseProduct(Scanner scan, ProductServiceImpl product);
	public boolean continueOrNot(Scanner scan);
}
