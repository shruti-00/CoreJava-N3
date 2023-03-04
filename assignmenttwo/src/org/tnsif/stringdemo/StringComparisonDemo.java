package org.tnsif.stringdemo;
//program to demonstrate on string comparison
public class StringComparisonDemo {

	public static void main(String[] args) {
		//string usng literals 
		String s1 = "TNSIF";
		String s2 = "TNSIF";

		//creating a string using new operator
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		String s5 = new String("TNSIFF");

		//string comparison
		System.out.println(s1==s2);
		/*because the new word will create a newpool and inside that it will create a
		new object for that string*/
		System.out.println(s2==s3); //by using ==
		System.out.println(s1.equals(s4)); //by using equals method
		
		//using compareTo
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("TNSIF"));
		System.out.println(s1.compareTo(s5)); //it will give -1 becz string is not same

	}
}

/*OUTPUT
true
false
true
-32
0 
-1
*/