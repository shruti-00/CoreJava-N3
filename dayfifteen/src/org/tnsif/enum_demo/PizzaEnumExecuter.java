package org.tnsif.enum_demo;

import java.util.Scanner;

import org.tnsif.enum_demo.PizzaEnumDemo.Size;

public class PizzaEnumExecuter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the pizza");

		String size=sc.nextLine();
		//converting size to enum
		Size s=Size.valueOf(size.toUpperCase());

		switch(s)
		{
			case SMALL:
				System.out.println("Preparing small pizza for Customer");
				break;
			case MEDIUM:
				System.out.println("Preparing MEDIUM pizza for Customer");
				break;
			case LARGE:
				System.out.println("Preparing LARGE pizza for Customer");
				break;
			case EXTRALARGE:
				System.out.println("Preparing EXTRALARGE pizza for Customer");
				break;
		}
	}
}