package org.tnsif.arraysdemo;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for n and m");
		int n=sc.nextInt();
		int m = sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr[0][1]);
	}

}
