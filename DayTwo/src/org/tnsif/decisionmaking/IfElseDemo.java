package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b ::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is not greater than b");
		}
		sc.close();
	}

}

/* OUTPUT
 Enter the value of a and b ::
7
14
a is not greater than b

Enter the value of a and b ::
78
52
a is greater than b
*/
