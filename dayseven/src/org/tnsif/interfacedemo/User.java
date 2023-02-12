package org.tnsif.interfacedemo;
//program to demonstrate on multiple inheritance using interface

//implementable class
public class User implements SBI, HDFC {

	@Override
	public String LoanType() {
		// TODO Auto-generated method stub
		return "Personal Loan";
	}

	@Override
	public float getInterest() {
		// TODO Auto-generated method stub
		return 12.8f;
	}

}
