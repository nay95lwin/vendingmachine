package com.vmcompany.cash;

public class CashServiceImpl implements CashService {

	/*
	 * validating the customer's cash input.
	 */
	@Override
	public boolean validateCashIn(int cashIn) {
		//String cashTypes = "";
		StringBuilder cashTypes = new StringBuilder();
		int acceptCash;

		for (Cash cash : Cash.values()) {
			acceptCash = cash.getCash();
			if(cashIn == acceptCash)
				return true;
			
			cashTypes.append(acceptCash + " ");
		}
		
		System.out.println("Sorry! Please only input the valid cash => " + cashTypes);
		return false;
	}
}
