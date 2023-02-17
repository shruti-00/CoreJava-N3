package org.tnsif.exceptionhandlingdemo;
//program to demonstrate 
import java.util.Scanner;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[]= new int[] {11,22,33};
		try {
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled"+e);
			}
			try {
				int res = x/y;
				System.out.println(res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception occurs :"+e);
			}
		}
		finally{
			System.out.println("Finally Block");
		}
	}

}

/*OUTPUT
enter the value of x and y :
12 0
Exception handledjava.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Arithmetic Exception occurs :java.lang.ArithmeticException: / by zero
Finally Block
*/
