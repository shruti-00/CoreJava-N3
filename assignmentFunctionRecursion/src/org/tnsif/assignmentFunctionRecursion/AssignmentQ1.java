package org.tnsif.assignmentFunctionRecursion;
//WAP to find the nth term in the fibonacci series using recursion
public class AssignmentQ1 {
	static int fib(int n)
	{
		//if(n==0)
		if(n==0||n==1)
			return 0;
		//else if(n==1)
		else if(n==2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(fib(n));
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number :");
		//int a=sc.nextInt();
		//for(int i=0; i<a; i++)
		//{
		//	System.out.println(fibonacci(i));
		//}
	}
}

/*OUTPUT
 21
*/
 
