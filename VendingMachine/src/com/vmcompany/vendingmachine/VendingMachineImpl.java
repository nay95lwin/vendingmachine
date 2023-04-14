package com.vmcompany.vendingmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.vmcompany.cash.CashServiceImpl;
import com.vmcompany.product.ProductServiceImpl;

public class VendingMachineImpl implements VendingMachine {

	/*
	 * request customer's cash input
	 */
	@Override
	public int getCashIn(Scanner scan) {
		int cashIn = 0;
		CashServiceImpl cash = new CashServiceImpl();
		
		do {
			try {
				System.out.print("Please input your cash: ");
				cashIn = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Invalid cash input.");
			}
			scan.nextLine(); // clear the buffer

		} while(!cash.validateCashIn(cashIn));
		
		return cashIn;
	}

	/*
	 * request customer's purchase product
	 */
	@Override
	public int getPurchaseProduct(Scanner scan, ProductServiceImpl product) {
		int purchaseProductID = 0;
		
		do {
			try {
				System.out.print("Select product to purchase: ");
				purchaseProductID = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid product input.");
			}
			scan.nextLine(); // clear the buffer
			
		} while(!product.validatePurchaseProduct(purchaseProductID));
		
		return purchaseProductID;
	}

	/*
	 * checking customer is willing to continue or not.
	 */
	@Override
	public boolean continueOrNot(Scanner scan) {
		do {
			System.out.print("Would your like to continue(Yes/No): ");
			
			switch(scan.nextLine().toLowerCase()) {
				case "yes":
					return true;
				case "no":
					return false;
				default:
					System.out.println("Please type valid input.");
			}
		} while(true);
	}

}
