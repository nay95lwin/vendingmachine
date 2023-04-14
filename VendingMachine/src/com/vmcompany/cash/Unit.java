package com.vmcompany.cash;

public enum Unit {
	YEN("yen"), KYAT("kyat"), DOLLAR("dollar");
	
	private String unit;
	
	private Unit(String unit) {
		this.unit = unit;
	}
	
	public String getUnit() {
		return unit;
	}
}
