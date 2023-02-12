package org.tnsif.polymorphismdemo;

import java.util.Scanner;
//program to demonstrate on method overloading 
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the resolution and slottype " + "of a cellphone :");
		int resolution = sc.nextInt();
		sc.nextLine();
		String slottype=sc.nextLine();
		Smartphone sp = new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		sp.display(resolution);
		sp.display(resolution, slottype);
		
		

	}

}

/*OUTPUT
 Enter the resolution and slottype of a cellphone :

108
108 singleslot
Camera resolution : 108
Camera resolution :108,Slottype :108 singleslot

 */