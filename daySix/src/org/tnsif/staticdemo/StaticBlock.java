package org.tnsif.staticdemo;
//program to demonstrate static block
public class StaticBlock {
	
	private int num; //nonstatic variable  
	private static String name;  //static variable
	
	//Static Block : Static block is used to initialize static variable
	static 
	{
		name="Shruti";
	}
	//getters and setters 
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
	
}
