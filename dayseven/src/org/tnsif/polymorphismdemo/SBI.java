package org.tnsif.polymorphismdemo;
//program to demonstrate on method overriding
//child class
public class SBI extends RBI{

	//overriding the parent class method here
	float getInterest()
	{
		System.out.println(super.getInterest());
		return 12.8f;
	}
}
