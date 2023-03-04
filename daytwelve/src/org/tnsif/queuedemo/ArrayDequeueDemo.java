package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> obj=new ArrayDeque<>();
		obj.add("Shruti");
		obj.addFirst("Aishwarya");
		obj.offerFirst("Miraj");
		obj.addLast("Swarit");
		System.out.println("Array Dequeue elementns are: ");
		for(String s: obj)
		{
			System.out.print(s+" ");
		}
		obj.removeFirst();
		System.out.println("\n\nRemove first: "+obj);
		obj.removeLast();
		System.out.println("Remove last: "+obj);
		obj.remove();
		System.out.println("Array Dequeue elemntns are: "+obj);
	}
}

/*OUTPUT
Array Dequeue elementns are: 
Miraj Aishwarya Shruti Swarit 

Remove first: [Aishwarya, Shruti, Swarit]
Remove last: [Aishwarya, Shruti]
Array Deque elemntns are: [Shruti]
*/