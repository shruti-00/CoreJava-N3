package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//example  on factorial of a number using recursion
public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num * factorial(num-1);
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for factorial :");
		int num=sc.nextInt();
		
		//Function call 
		System.out.println("Fact of given no. using recursion is :"+factorial(num));
		sc.close();
	}

}

/*OUTPUT
Enter the no for factorial :
4
Fact of given no. using recursion is :24

Enter the no for factorial :
1
Fact of given no. using recursion is :1

Enter the no for factorial :
0
Fact of given no. using recursion is :1

*/
