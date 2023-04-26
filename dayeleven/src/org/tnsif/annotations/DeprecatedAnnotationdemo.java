package org.tnsif.annotations;
class DeprecatedDemo
{
	@Deprecated
	//deprecated method is used with unimportant methods,fields etc   
	public void display()
	{
		System.out.println("Deprecated annotation demo..");
	}
	
}
public class DeprecatedAnnotationdemo {

	public static void main(String[]args) {
	DeprecatedDemo d = new DeprecatedDemo();
	d.display();
		
	}
}

/*OUTPUT
Deprecated annotation demo..
*/