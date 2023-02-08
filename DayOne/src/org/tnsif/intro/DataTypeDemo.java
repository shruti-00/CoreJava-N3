package org.tnsif.intro;

public class DataTypeDemo {

	public static void main(String[] args) {
		byte a = 127;
		int b = 128;
		float c = 12/5;
		float d =5/2.5f;
		double e=12/5;
		double f=12d/5d;
		char z = 's'; //character
		int x='c'; //ASCII representation
		//boolean y =true;

		String name = "Shruti";
		System.out.println("The byte value of a is:"+a);
		System.out.println("The int value of b is:"+b);
		System.out.println("The float value of c is:"+c);
		System.out.println("The float value of d is:"+d);
		System.out.println("The double value of e is:"+e);
		System.out.println("The double d value of f is:"+f);

		System.out.println("The char value of z is:"+z);
		System.out.println("The ascii value of x is:"+x);
		System.out.println("The name is:"+name);
	}
}
