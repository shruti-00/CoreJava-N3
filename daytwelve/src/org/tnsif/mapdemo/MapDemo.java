package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//program to demonstrate on diff between hashmap and linkedhashmap
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj1=new HashMap<>();
		obj1.put(422000, "Jatara");
		obj1.put(422002, "Balimandir");
		obj1.put(422003, "Dwaraka");
		obj1.put(411001, "MG road");//Nashik
		obj1.put(422001, "MG road");//Pune

		System.out.println(obj1+" ");

		Map<Integer,String>obj2=new LinkedHashMap<>();
		obj2.put(422000, "Jatara");
		obj2.put(422002, "Balimandir");
		obj2.put(422003, "Dwaraka");
		obj2.put(411001, "MG road");//Nashik
		obj2.put(422001, "MG road");//Pune

		System.out.println(obj2+" ");
	}
}

/*OUTPUT
{422002=Balimandir, 422003=Dwaraka, 422000=Jatara, 422001=MG road, 411001=MG road} 
{422000=Jatara, 422002=Balimandir, 422003=Dwaraka, 411001=MG road, 422001=MG road}
*/