package org.tnsif.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;
//Demo on Slit method using delimiter
public class SplitMethodDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String delimiter=" ";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		for(String s1:res)
		{
			System.out.println(s1);
		}
	}
}