package org.tnsif.multilevelinheritance;

import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values modelno, version, slottype :");
		int modelno = sc.nextInt();
		sc.nextLine();
		String version = sc.nextLine();
		String slottype = sc.nextLine();
		Iphone i = new Iphone(); //default constructor
		Iphone i1 = new Iphone(modelno, version, slottype); //parameterized constructor
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
//		i1.getModelno();
//		i1.getVersion();       
//		i1.getSlottype();
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);
		sc.close();
		
	}

}

/*OUTPUT
 Enter the values modelno, version, slottype by get line no 19:
101
cupcake
singleslot
Nokia class
Nokia class
Iphone [slottype=singleslot, getVersion()=cupcake, getModelno()=101]


Enter the values modelno, version, slottype by making it public: 
101
cupcake
singleslot
Nokia class
Nokia class
Slottype is :singleslot
The android version is cupcake
The model no. is 101
Iphone [slottype=singleslot, getVersion()=cupcake, getModelno()=101]
*/


