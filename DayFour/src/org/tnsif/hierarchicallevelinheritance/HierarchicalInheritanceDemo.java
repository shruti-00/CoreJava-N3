package org.tnsif.hierarchicallevelinheritance;

import java.util.Scanner;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type and version");
		String type=sc.nextLine();
		int version=sc.nextInt();
		int version1=sc.nextInt();
		SnowCone s1=new SnowCone(type, version);
		s1.setType(type);
		s1.setVersion(version);

		Tiramisu t=new Tiramisu(version1);
		t.setType(type);
		t.setVersion(version1);

		
		System.out.println(s1);
		System.out.println(t);
		
		sc.close();

	}

}

/*Enter the type and version
vivo
12
13
Parent class-Android version : 
Parent class-Android version : 
SnowCone [version=12]
Tiramisu [version=13, toString()=AnderoidVersion [type=vivo]]
*/