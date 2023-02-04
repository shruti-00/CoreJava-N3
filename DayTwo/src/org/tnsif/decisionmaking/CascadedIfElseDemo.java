package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a,  b and c ::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c ");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater than a and c ");
		}
		if(c>a && c>b)
		{
			System.out.println("c is greater than a and b ");
		}
	}

}

/*OUTPUT
Enter the value a,  b and c ::
70
60
50
a is greater than b and c 

Enter the value a,  b and c ::
60
70
50
b is greater than a and c

Enter the value a,  b and c ::
60
50
70
c is greater than a and b 
*/
