package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Decision making if Statement 
		if(a==b)
		{ 		 
			System.out.println("value of a is equal to b");
			//System.out.println("value of a is not equal to b");
		}	
	}

}

/* OUTPUT
Enter the value of a and b
4
4
value of a is equal to b
 */