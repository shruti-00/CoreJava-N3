package org.tnsif.finalkeyword;
//to demonstrate on final keyword with variable
public class FinalVariable {

	final static int x = 15;
	public static void print()
	{
		/*we cant change the value of x here as x is declare as final*/
		//x=17;
		System.out.println("The value of x is :"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable.print();

		
	}

}

/*The value of x is :15*/