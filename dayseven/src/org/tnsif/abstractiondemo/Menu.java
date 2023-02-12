package org.tnsif.abstractiondemo;

//program to demonstrate on abstrat class and abstract method
//abstract class
//class cannot be final abstract
public abstract class Menu {

	//abstract method
	abstract void receipe();
	abstract void foodtype();
	
	//concrete method means non abstract method
	void menuType()
	{
		System.out.println("Veg and Nonveg");
	}
}
