package org.tnsif.thiskeyword;

class HR
{
	//void display()
	void display(HR obj)
	{
		System.out.println("Human Resource ...");
	}
	void accept()
	{
		display(this);
		//display();
	}
}
public class ThisExecutor {

	public static void main(String[] args) {
		HR obj = new HR();
		obj.accept();
		
	}

}
