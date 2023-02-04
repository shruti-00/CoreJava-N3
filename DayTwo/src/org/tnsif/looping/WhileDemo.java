package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 1;
		//while(x<3)
		//{
			//System.out.println("Hello Shruti:");
			//x++;
		//}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of  a and b ::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 1;
		if(a>b)
		{	
			while(i<=2)
			{
				System.out.println("Welcome... ");
				i++;
			}
		}
		else System.out.println("Bye...");
	}

}

/*OUTPUT by system
Hello Shruti:

OUTPUT By User Input
Enter the value of  a and b ::
80
70
Welcome... 
Welcome... 

Enter the value of  a and b ::
80
90
Bye...


*/
