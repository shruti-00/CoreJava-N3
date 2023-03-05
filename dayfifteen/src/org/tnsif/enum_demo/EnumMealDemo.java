package org.tnsif.enum_demo;

public class EnumMealDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot create object of enum
		for(Meals m:Meals.values())
		{
			System.out.println(m+" "+m.getValue());
		}
	}

}