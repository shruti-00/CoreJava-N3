package org.tnsif.arraysdemo;

import java.util.Scanner;
//program to demonstrate on array object
public class ArrayObjectDemo {

	public static void main(String[] args) 
	{
		Student arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements "+ "in the array");
		int n = sc.nextInt();
		arr = new Student[n];
		int i = 0;
		while(i<n);
		{
			arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			i++;
		}
		for(int j = 0; j<n; j++)
		{
			System.out.println(arr[j].getRollno()+" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
		
	}

}
