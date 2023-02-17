package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on throw and throws keyword
public class ThrowkeywordDemo {
	//method defination
	//throws is used to declae an exception
	public static void donate(int age, int weight)throws Exception 
	{
		if(age>18 && weight>50)
			System.out.println("Eligible to donate the blood");
		else
			//to throw an exception explicitly
			throw new Exception("Not eligible");
	}
	public static void main(String[] args) {
	try {
		donate(17,55);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}

