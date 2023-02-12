package org.tnsif.finalkeyword;

public class Pineapple extends Cake{
	private int price;
	/*if any method is declare as final in parent class
	 * and we are going to use that method inside the child class then we cant 
	 * override but we can overload it*/
	/*void display()
	{
		System.out.println();
	}*/

	final void display(int price)
	{
		System.out.println("The price is :"+price);
	}

	//getters and setters 
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
