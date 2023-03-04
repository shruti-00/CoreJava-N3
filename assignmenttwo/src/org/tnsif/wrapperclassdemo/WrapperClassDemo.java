package org.tnsif.wrapperclassdemo;
//program to demonstrate on auto and unboxing
public class WrapperClassDemo {

	public static void main(String[] args) {
		//Autoboxing means converting from primitive datatype into its object
		int x=18;
		Integer y=x;
		System.out.println(y);
		
		//Unboxing 
		@SuppressWarnings("removal")
		Integer i=new Integer(10);
		System.out.println(i);
		int b =i.intValue();
		System.out.println(b); 
	}
}


/*OUTPUT
18
10
10
*/