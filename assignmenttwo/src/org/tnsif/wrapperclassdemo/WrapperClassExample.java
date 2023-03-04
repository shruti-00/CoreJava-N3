package org.tnsif.wrapperclassdemo;
//program of wrapper class using command line arguments
public class WrapperClassExample {

	public static void main(String[] args) {
		System.out.println("Welcome to TNSIF");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int res = a+b;
		 System.out.println(res);
	}

} 
