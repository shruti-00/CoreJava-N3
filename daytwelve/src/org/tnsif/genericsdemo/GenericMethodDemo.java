package org.tnsif.genericsdemo;
//program to demonstrate on generic method
public class GenericMethodDemo {
	public static <E> void print(E[] elements) {
		for(E element : elements)
		{
			System.out.print(element+" ");
		}
	}

	public static void main(String[] args) {

		Integer[] ar1= {10,45,78,34,89};
		Character[] ar2= {'D','N','G','R'};
		System.out.println("Integer array: ");
		print(ar1);
		System.out.println("\nCharacter array: ");
		print(ar2);
	}
}

/*OUTPUT
Integer array: 
10 45 78 34 89 
Character array: 
D N G R 
*/