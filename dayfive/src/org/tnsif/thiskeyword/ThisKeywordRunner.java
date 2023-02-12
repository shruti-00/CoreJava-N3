package org.tnsif.thiskeyword;

class Mathematics
{
	int a,b;
	Mathematics()
	{ 
		a=10;
		b=20;
	}
	Mathematics accept()
	{
		return this;
	}
	void display()
	{
		System.out.println("Value of A="+a);
		System.out.println("Value of B="+b);
	}
}
public class ThisKeywordRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematics m = new Mathematics();
//		m.accept();
//		m.display();
		m.accept().display();
	}
}


/*OUTPUT
Value of A=10
Value of B=20
*/