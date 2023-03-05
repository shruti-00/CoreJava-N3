package org.tnsif.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Demo on Matcher method of matcher class
public class RegExMatcherClassDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Payal");
		Matcher m=p.matcher("My name is Payal");
		while(m.find())
		{
			System.out.println("Pattern Fount at: "+m.start()+" "+m.end());
		}
	}
}