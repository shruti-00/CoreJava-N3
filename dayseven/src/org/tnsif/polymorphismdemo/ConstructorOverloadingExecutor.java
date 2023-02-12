package org.tnsif.polymorphismdemo;
//program to demonstrate on constructor overloading
//driver class
import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed and color:");
		int speed = sc.nextInt();
		sc.nextLine();
		String color=sc.nextLine();
		HondaCity h = new HondaCity();
		HondaCity hc = new HondaCity(speed,color);
		
		sc.close();

	}

}
/*OUTPUT
 * Enter the speed and color:

108
red
I like to drive a honda city
Speed is :108,color is :red
*/
