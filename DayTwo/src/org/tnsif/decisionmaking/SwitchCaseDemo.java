package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice ::");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Kesariya");
			break;
		case 2:
			System.out.println("ved");
			break;
		case 3:
			System.out.println("calm down");
			break;
		default:
			System.out.println("Explore More songs!!!");
			break;
		}
		sc.close();
	}
}

/*OUTPUT
 Enter your choice ::
1
Kesariya

Enter your choice ::
2
ved

Enter your choice ::
2
calm down

Enter your choice ::
4
Explore More songs!!!


*/
