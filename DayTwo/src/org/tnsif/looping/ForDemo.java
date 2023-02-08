package org.tnsif.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of i");
		int n=s.nextInt();

		// to print 1 to N numbers
		System.out.println("The value of i from 1 to n");
		for(int i=1; i<=n; i++)
		{
			System.out.println(i+" ");
		}

		// to print N to 1 numbers
		System.out.println("The value of i from n to 1");
		for(int i=n; i>=1; i--)
		{
			System.out.println(i+" ");
		}
		s.close();
	}
}

/*OUTPUT
 Enter the value of i
 5
The value of i from 1 to n
1 
2 
3 
4 
5 
The value of i from n to 1
5 
4 
3 
2 
1 
 */