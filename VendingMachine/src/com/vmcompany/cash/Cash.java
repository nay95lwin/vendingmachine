package com.vmcompany.cash;

public enum Cash {
	C1000(1000), C500(500), C100(100), C50(50);
	
	private int cash;
	
	private Cash(int cash) {
		this.cash = cash;
	}
	
	public int getCash() {
		return cash;
	}
}
