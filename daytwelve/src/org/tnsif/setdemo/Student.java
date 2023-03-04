package org.tnsif.setdemo;
//program to demonstrate on user define object
public class Student {
	
	//private data members
	private int roll_no;
	private String name;
	private float percentage;

	//constructors
	public Student(int roll_no, String name, float percentage) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
	}
	//getter setter
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	//to string
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", percentage=" + percentage + "]";
	}
}