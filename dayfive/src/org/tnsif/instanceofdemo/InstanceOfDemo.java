package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, address, age");
		String name=sc.nextLine();
		String address = sc.nextLine();
		int age = sc.nextInt();
		
		//object creation
		Child c = new Child();
		Child c1 =new Child(name, address, age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		
		System.out.println(c1);
		
		//instanceof
		System.out.println(c instanceof Person);
		System.out.println(c1 instanceof Child);	
		sc.close();
	}
}


/*
Enter the name, address, age
Shruti
Nashik
21
Parent class
Parent class
Child [age=21, getName()=Shruti, getAddress()=Nashik]
true
true
*/