package org.tnsif.annotations;

import java.util.Scanner;

public class SuppressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//this annotation is used to remove warnings which occur 
		//at the comiple time
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		//sc.close();
	}

}
