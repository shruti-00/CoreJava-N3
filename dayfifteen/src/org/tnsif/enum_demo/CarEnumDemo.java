package org.tnsif.enum_demo;
//Accesing enum Constants
public class CarEnumDemo {
public static void main(String args[])
	{
		/*Car c1=Car.TESLA;
		System.out.println(c1);*/
	
		//using enhanced for loop
		for(Car c:Car.values())
		{
			System.out.println(c);
			//System.out.println(c.TESLA);
		}
	}
}
