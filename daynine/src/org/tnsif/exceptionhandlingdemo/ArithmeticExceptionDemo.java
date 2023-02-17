package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

//program to demonstrate on ArithemeticException
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			int res=x/y;
			System.out.println(res);
		}
		//catch block handles the exception thrown by the try block
		catch(Exception e)
		{
			System.out.println("Exception handled using catch :"+e);
		}
		finally {
			System.out.println("Finally Block ");
		}
	}
}

/*
 OUTPUT
Enter the value for x and y

12 0
Exception handled using catch :java.lang.ArithmeticException: / by zero
Finally Block 
*/
