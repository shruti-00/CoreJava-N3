package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the studs age and weight");
		int age= sc.nextInt();
		int weight = sc.nextInt();
		
		if(age>12)
		{
			if(weight>=40)
			{
				if(weight<120)
				{
					System.out.println("Eligible for Bunjee Jumping");
				}
				else 
					System.out.println("Extra ropes will be added");
			}
			else
			{
				System.out.println("Not Eligible for this criteria ");
			}
		}
		else 
		{
			System.out.println("Not Eligible for age less than 12 ");
		}
	}

}

/* OUTPUT
Enter the studs age and weight
13
41
Eligible for Bunjee Jumping

Enter the studs age and weight
14
123
Extra ropes will be added

Enter the studs age and weight
15
35
Not Eligible for this criteria 

Enter the studs age and weight
3
40
Not Eligible for age less than 12 
 */
