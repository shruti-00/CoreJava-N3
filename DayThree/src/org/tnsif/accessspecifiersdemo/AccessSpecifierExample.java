package org.tnsif.accessspecifiersdemo;

public class AccessSpecifierExample {
	
	//data members
	private String name;
	/*if any data members is default it will access only inside the same package*/
	//void display();
	public void display()
	{
		System.out.println("The name is :"+name);
	}
	
	//getters and setters for private data members
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
