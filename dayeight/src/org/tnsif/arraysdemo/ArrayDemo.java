package org.tnsif.arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elememts" + " in the array");
		int n = sc.nextInt();
		//array declaration
		int arr[]=new int[n];
		//to allocate the value to an array
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Array elements are");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
		//to sort an array elements
		Arrays.sort(arr);
		System.out.println("The sorted order is : ");
		/*for(int i = 0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}*/
		System.out.println(arr);
		for(int itr:arr) //enhanced for loop 
		{
			System.out.println(itr+" ");
		}
		sc.close();
	}

}


/*OUTPUT
Enter the no.of elememts in the array
3
89
45
54
Array elements are
89 
45 
54 
The sorted orde,r is : 
[I@59a6e353
45 
54 
89 */