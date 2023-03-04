package org.tnsif.listdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Object> obj1=new Vector<>();
		obj1.add(10);
		obj1.add(23.78f);
		obj1.add("Shruti");
		obj1.add('A');
		obj1.add(true);
		System.out.println("1st :"+obj1);

		System.out.println("Size of List1: "+obj1.size());
		System.out.println("Is list1 is empty? "+obj1.isEmpty());
		obj1.remove(0);
		System.out.println("1st :"+obj1);
		System.out.println(obj1.contains(10));
		System.out.println("Element at index 1: "+obj1.get(1));
		System.out.println("Index of 'A':"+obj1.indexOf('A'));
		obj1.add(23.78);
		System.out.println("2nd :"+obj1);

		System.out.println("Index of 23.78f: "+obj1.indexOf(23.78));
	}
}

/*OUTPUT
1st :[10, 23.78, Shruti, A, true]
Size of List1: 5
Is list1 is empty? false
1st :[23.78, Shruti, A, true]
false
Element at index 1: Shruti
Index of 'A':2
2nd :[23.78, Shruti, A, true, 23.78]
Index of 23.78f: 4
*/