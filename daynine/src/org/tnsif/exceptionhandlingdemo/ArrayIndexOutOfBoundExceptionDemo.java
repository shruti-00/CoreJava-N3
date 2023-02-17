package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First class");
		System.out.println("Second class");
		try 
		{
			int[] myIntArray = new int[] {1,2,3};
			print(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesnt have fourth element");
		}
		System.out.println("Third line");
	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
	}
}

/*OUTPUT
First class
Second class
The array doesn't have fourth element
Third line
 */