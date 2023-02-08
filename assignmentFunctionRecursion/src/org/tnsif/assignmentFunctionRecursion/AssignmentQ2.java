package org.tnsif.assignmentFunctionRecursion;
//WAP to find the sum of digits in a number using recursion
public class AssignmentQ2 {
	static int sum_of_digit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return(n % 10 +sum_of_digit(n/10));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int result = sum_of_digit(num);
		System.out.println(" The sum of digits is " + num +" is " + result);
		
		}
}

/*OUTPUT
The sum of digits is 1234 is 10
*/