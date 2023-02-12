package org.tnsif.abstractiondemo;
//implementable class
public class ButterChicken extends Menu {
	
	/*implement all the abstract method of abstract class*/
	@Override
	void receipe() 
	{
		System.out.println("Wash and cook a chicken");
	}
	
	@Override
	void foodtype() 
	{
		System.out.println("Non-veg");
	}

}
