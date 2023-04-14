package com.vmcompany;

import com.vmcompany.cash.Unit;

public enum DefaultValue {
	CASHUNIT(Unit.YEN);
	
	private Unit unit;
	
	private DefaultValue(Unit unit) {
		this.unit = unit;
	}
	
	public Unit getDefaultUnit() {
		return unit;
	}
}
