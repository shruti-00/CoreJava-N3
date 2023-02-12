package org.tnsif.abstractiondemo;

public class AbstractionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ButterChicken bc = new ButterChicken();
		/*We can't instantiate the abstract class*/
		//Menu m = new Menu();
		
		bc.foodtype();
		bc.menuType();
		bc.receipe();
	}

}

/*OUTPUT
Non-veg
Veg and Nonveg
Wash and cook a chicken
*/