package org.tnsif.enum_demo;

public enum EnumCardsDemo implements InterfaceCardsDemo{
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		 System.out.println("Shape in the cards are: "+this);
	}
}
