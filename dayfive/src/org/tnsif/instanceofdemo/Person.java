package org.tnsif.instanceofdemo;

//to demonstrate an example on instance of operator
//Parent class
public class Person {
	private String name;
	private String address;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
		System.out.println("Parent class");
		// TODO Auto-generated constructor stub
	}
	
	//Par
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	//toStringis used to print
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	

}
