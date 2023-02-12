package org.tnsif.thiskeyword;

class Account{
	int a;
	int b;
	
	/*public void setData(int a, int b)
	{
		a=a;
		b=b;
		
		//Changing variable name we will also get the values
	}*/
	public void setData(int a, int b)
	{
		//this keyword in terms of method
		this.a=a;
		this.b=b;
	}
	public void showData()
	{
		
		System.out.println("Value of A="+a);
		System.out.println("Value of B="+b);
		
	}

}
public class ThiskeywordDemo
{
	public static void main(String args[])
	{
		Account obj = new Account();
		obj.setData(4,9);
		obj.showData();
	}
}

/*OUTPUT
 Value of A=0
Value of B=0

Value of A=4
Value of B=9
*/