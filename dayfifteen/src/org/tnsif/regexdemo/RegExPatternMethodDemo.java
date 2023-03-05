package org.tnsif.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExPatternMethodDemo {

	public static void main(String[] args) {
		String pattern="Payal Pagere";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input for matching: ");
		String input=sc.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
	}
}