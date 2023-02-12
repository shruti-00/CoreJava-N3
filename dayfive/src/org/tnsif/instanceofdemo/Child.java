package org.tnsif.instanceofdemo;

public class Child extends Person {
	
	private int age;

	//getters an setters 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//default constructor
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Child(String name, String address, int age) {
		super();
		this.age = age;
	}

	//to string when we call the object it will call the tostring method
	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
}
