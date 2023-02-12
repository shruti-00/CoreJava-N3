package org.tnsif.interfacedemo;
//program to demonstrate on interface 

//implementable class
public class Avenger implements Bike{

	@Override
	public void milage(int speed) {
		System.out.println("Speed is :"+speed);
	}

	@Override
	public void engine() {
		System.out.println("Its working on Petrol");
		
	}
}
