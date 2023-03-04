package org.tnsif.stringdemo;
//program to demonstrate on differnt string operation
public class StringOperationDemo {

	public static void main(String[] args) {
		String s1 = new String("Bhujbal knowledge city");
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(2,6));
		System.out.println(s1.substring(2));
		System.out.println(s1.isEmpty());
	}

}
/*OUTPUT
Bhujbal knowledge city
BHUJBAL KNOWLEDGE CITY
22
ujba
ujbal knowledge city
false
*/



