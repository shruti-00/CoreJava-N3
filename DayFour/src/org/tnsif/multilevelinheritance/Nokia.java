package org.tnsif.multilevelinheritance;

//to demonstarate an example on multilevel inheritance 
public class Nokia {

	//data members
	private int modelno;
	public void display()
	{
		System.out.println("The model no. is "+modelno);
	}
	
	//default constructor
	//in default constructor do not use super()
	public Nokia() {
		// TODO Auto-generated constructor stub
		System.out.println("Nokia class");
	}
	
	//Parameterized constructor
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
}
