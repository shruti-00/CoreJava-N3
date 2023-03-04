package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Shruti");
		obj.push("Ruchita");
		obj.push("Dnyaneshwar");
		obj.push("Bhushan");

		System.out.println("The elements inside the stack" + "are:"+obj);
		obj.pop();
		System.out.println("The elements inside the stack are :"+obj);
	}
}

/*OUTPUT
The elements inside the stackare:[Shruti, Ruchita, Dnyaneshwar, Bhushan]
The elements inside the stack are :[Shruti, Ruchita, Dnyaneshwar]
*/