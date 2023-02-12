package org.tnsif.polymorphismdemo;
//program to demonstrate on method overloading 
public class Smartphone {
	//private data members
	private int resolution;
	private String slottype;
	//Method overloading in terms of by passing n0. of arguments 
	void display (int resolution)
	{
		System.out.println("Camera resolution : "+resolution);
	}
	void display(int resolution, String slottype)
	{
		System.out.println("Camera resolution :"+resolution+ ","+"Slottype :" +slottype);
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

}
