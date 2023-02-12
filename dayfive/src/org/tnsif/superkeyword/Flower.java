package org.tnsif.superkeyword;
//program to demonstrate an example of super keyword in terms of variable.
public class Flower {
	private String name;

	//getters and setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Default constructor
	public Flower() {
		System.out.println("Flower - Parent class");		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor 
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
	

}
