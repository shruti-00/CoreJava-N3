package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//program to demonstrate on difference between hashset and linkedhashset
public class SetDemo {

	public static void main(String[] args) {
		//HashSet will print the elements in unordered wise
		Set<Object> obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Shruti");
		obj1.add(346.79f);
		obj1.add(true);
		System.out.println("Set1 elements are: "+obj1);

		//LinkedHashSet will print the elements in ordered wise
		Set<Object> obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Shruti");
		obj2.add(346.79f);
		obj2.add(true);
		obj2.add(true);//set not allowed duplicate element
		System.out.println("Set2 elements are: "+obj2);

		System.out.println("Obj1==obj2 "+obj1.equals(obj2));
	}
}

/*OUTPUT
Set1 elements are: [346.79, 11, Shruti, true]
Set2 elements are: [11, Shruti, 346.79, true]
Obj1==obj2 true
*/