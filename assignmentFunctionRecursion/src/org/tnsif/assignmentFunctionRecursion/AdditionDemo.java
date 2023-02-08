package org.tnsif.assignmentFunctionRecursion;
//to demonstrate an example on function
import java.util.Scanner;

public class AdditionDemo{
	
	 //Function definition 1st method.. and int x and y is a formal variable
//	    static int addition(int x, int y) {
//		int sum = x+y;
//		return sum;
		
	//function definition 2nd method 
	    static void addition(int x, int y)
	    {
	    	int sum = x+y;
			System.out.println("The sum is :"+sum); //is use to print the value
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		// you can keep the variable as it is or change it, and a and b is a actual variable. 
		int x = sc.nextInt();
		int y = sc.nextInt();
		//function call
		addition(x,y);
		//System.out.println(addition(x,y)); //is use to print the addition
		sc.close();	
		}
}

/*OUTPUT
Enter the value of x and y: 
10
20
The sum is :30
 */