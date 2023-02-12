package org.tnsif.interfacedemo;
//program to demonstrate on multiple inheritance using interface
//driver class
public class MultipleInterfaceExecutor {

	public static void main(String[] args) {
		
		User u = new User();
		System.out.println(u.LoanType());
		System.out.println(u.getInterest());
		}

}

/*OUTPUT
 Personal Loan
12.8
 */