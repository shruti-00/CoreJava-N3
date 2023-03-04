package org.tnsif.stringdemo;
//program to demonstrate an example on string creation.
import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		//using string literal
		String str1 = sc.nextLine();
		System.out.println("First string is : "+str1);
		//using new keyword
		System.out.println("Enter the Second string : ");
		String str2 = new String(sc.nextLine());
		System.out.println("Second string is : "+str2);
		if(str1==str2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same its different");
		}
		
		System.out.println("Enter the third string : ");
		//using string literal
		String str3 = sc.nextLine();
		System.out.println("Third string is : "+str3);
		//using new keyword
		System.out.println("Enter the fourth string : ");
		String str4 = new String(sc.nextLine());
		System.out.println("Fourth string is : "+str4);
		if(str3.equals(str4))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same its different");
		}
		char c[] = {'H','e','l','l','o'};
		String str5 = new String(c); 
		System.out.println(str5);
		sc.close();
	}
}

/*OUTPUT
 *****by using ==*****
Enter the first string : 
shruti
First string is : shruti

Enter the Second string : 
shruti
Second string is : shruti

Not same its different
*****by using .equals*****
Enter the third string : 
shruti
Third string is : shruti

Enter the fourth string : 
shruti
Fourth string is : shruti

Same
Hello 
*/
