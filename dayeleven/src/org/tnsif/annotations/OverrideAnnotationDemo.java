 package org.tnsif.annotations;
//Demo on override annotation

class Parent
{
	public void print()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	@Override
	public void print()
	{
		//super.print();
		System.out.println("Child class method");
	}
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		//Child c = new Child(); 
		Parent p = new Child();
		p.print();
	}
}

/*OUTPUT
Parent class method
Child class method
*/