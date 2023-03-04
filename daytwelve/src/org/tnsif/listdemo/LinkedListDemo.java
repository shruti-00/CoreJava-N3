package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*Collection is an interface we cant create an object */
		Collection<Object> obj=new ArrayList<>();
		obj.add(11);
		obj.add(11.5f);
		obj.add('z');
		System.out.println("First list is : "+obj);
		
		//List2
		List<Object> obj1=new LinkedList<>();
		obj1.add(101);
		obj1.add(30.5f);
		obj1.add('c');
		obj1.add(30.5);

		//obj1.addAll(obj);
		System.out.println("First List is : "+obj1);
		System.out.println("Size of list1 :"+obj.size());
		System.out.println("Is List2 empty :"+obj.isEmpty());
		obj.remove(0);
		System.out.println("First list is : "+obj);
		System.out.println(obj1.contains(101));
		System.out.println("Element at index 1:"+obj1.get(1));
		System.out.println();
		
		List<Integer>obj3 = new ArrayList<>();
		obj3.add(67);
		obj3.add(16);
		obj3.add(45);
		System.out.println("List 3 is : "+obj3);
		//to sort in ascending wise
		Collections.sort(obj3);
		System.out.println("Ascending order "+obj3);
		Collections.reverse(obj3);
		System.out.println("Descending order :" +obj3);
		

	}
}

/*OUTPUT
First list is : [11, 11.5, z]
Second List is : [101, 11.5, c, 11, 11.5, z]
Size of list1 :3
Is List2 empty :false
First list is : [11.5, z]
true
*/

