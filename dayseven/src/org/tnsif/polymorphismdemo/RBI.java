package org.tnsif.polymorphismdemo;
//program to demonstrate on method overriding
//parent class
public class RBI {
	
	float getInterest()
	{
		return 10.8f;
	}
	/*If we use method overriding in same class we will get error , so we have to use inheritance
	 * to achieve method overriding
	 * 
	 * float getInterest()
	 * {
	 * 	return 10.8f;
	 * }*/

}
