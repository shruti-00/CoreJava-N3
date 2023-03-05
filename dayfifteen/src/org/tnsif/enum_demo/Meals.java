package org.tnsif.enum_demo;

public enum Meals {
	BREAKFAST(4),LUNCH(7),DINNER(10);
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	//constarucor to intiliaze the value 
	private Meals(int value) {
		this.value = value;
	}


}