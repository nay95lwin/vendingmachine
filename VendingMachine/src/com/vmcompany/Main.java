package com.vmcompany;

import java.util.Scanner;

import com.vmcompany.product.Product;
import com.vmcompany.product.ProductServiceImpl;
import com.vmcompany.vendingmachine.VendingMachineImpl;

public class Main {

	public static void main(String[] args) {
		// Vending Machine Program
		boolean isContinue = false;
		int balance = 0;
		Product purchaseProduct;
		
		Scanner scan = new Scanner(System.in);
		ProductServiceImpl product = new ProductServiceImpl();
		VendingMachineImpl vendingMachine = new VendingMachineImpl();
		
		do {
			System.out.println("Welcome from Vending Machine!");
			product.displayAllProductList();
			
			balance += vendingMachine.getCashIn(scan);
			
			System.out.println("\nChoose the following items to purchase: ");
			product.displayProductListByBalance(balance);
			
			purchaseProduct = product.getProductByID(vendingMachine.getPurchaseProduct(scan, product));
			
			if(purchaseProduct != null && balance >= purchaseProduct.getProductPrice()) {
				balance -= purchaseProduct.getProductPrice();
				System.out.println("Purchase successfully.");
				
				isContinue = vendingMachine.continueOrNot(scan);
				System.out.print("\n\n");
				
				if(!isContinue)
					System.out.println("Thank you!\nYour changes: " + balance + DefaultValue.CASHUNIT.getDefaultUnit().getUnit());
			} else {
				System.out.println("Sorry! Not enough money.\nPlease input more cash.\nYour changes: " + balance + DefaultValue.CASHUNIT.getDefaultUnit().getUnit());
				break; // or isContinue = false;
			}
			
		} while(isContinue);
		
		scan.close();
	}

}
