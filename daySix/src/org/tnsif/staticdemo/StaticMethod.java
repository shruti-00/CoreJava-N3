package org.tnsif.staticdemo;
//program to demonstrate on static method
public class StaticMethod {
	
	//data members
	private static double salary=32000.23;
	//static method
	public static void display()
	{
		System.out.println("The salary is :" +salary);
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
