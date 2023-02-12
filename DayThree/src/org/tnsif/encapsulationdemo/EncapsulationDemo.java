package org.tnsif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  pin :");
		HDFC h =new HDFC();
		//h.setPin(8523);
		h.setPin(sc.nextInt());
		System.out.println(h.getPin());
		h.accept();
		sc.close();
	}

}
