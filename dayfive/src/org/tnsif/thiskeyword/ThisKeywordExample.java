package org.tnsif.thiskeyword;
class Banking
{
	int num;
	Banking()
	{
		System.out.println("Parent class");
	}
	Banking(int num)
	{
		//num = num;
		//Num value :0 output
		//this keyword in terms of constructor
		this.num = num;
	}
	void print()
	{
		System.out.println("Number is :" +num);
	}
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		Banking b = new Banking();
		Banking b1 = new Banking(885656);
		b1.print();
		//System.out.println("Num value :"+b.num);
		
	}

}
