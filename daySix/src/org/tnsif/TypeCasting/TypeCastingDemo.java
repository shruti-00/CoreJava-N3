package org.tnsif.TypeCasting;
//Program to demonstrate on typecasting 
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//implicit typecasting
		int x=15;
		float y = x;
		System.out.println("The value of y is :"+y);
		
		//explicit typecasting 
		double d =12.5;
		long l =(long)d; //
		System.out.println("The value of l is : "+l);
		}

}



/*OUTPUT
 The value of y is :15.0
 The value of l is :12

 */