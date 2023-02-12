package org.tnsif.classandobject;

import java.util.Scanner;

//driver class

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Customer c = new Customer(01,"Shruti","Nashik");
		//c.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value id name and city::");
		int id;
		String custname, city;
		
		id  = sc.nextInt();
		sc.nextLine();
		
		custname = sc.nextLine();
		city = sc.nextLine();
		
		//for cust1
		Customer c1 = new Customer();
		c1.setId(id);
		c1.setCustname(custname);
		c1.setCity(city);
		c1.display();
		sc.close();
		
		//for cust2
		//@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the value id name and city::");
		int id2;
		String custname2, city2;
		
		id2  = sc2.nextInt();
		sc2.nextLine();
		
		custname2 = sc2.nextLine();
		city2 = sc2.nextLine();
		
		//for cust1
		Customer c2 = new Customer();
		c2.setId(id2);
		c2.setCustname(custname2);
		c2.setCity(city2);
		c2.display();
		sc2.close();
		
		
		
		
	}

}
