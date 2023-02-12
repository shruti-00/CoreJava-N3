package org.tnsif.superkeyword;

//program to demonstrate an example of super keyword in terms of variable.

//driver class
public class SuperVariableDemo {

	public static void main(String[] args) {
		
		Rose r = new Rose();
		//Rose r1 = new Rose();
		r.setName("Rose");
		r.display();
	}

}

/*OUTPUT
Flower - Parent class
Rose
Flower
*/
