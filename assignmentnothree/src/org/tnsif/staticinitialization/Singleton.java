package org.tnsif.staticinitialization;

import org.tnsif.staticinitialization.Singleton;

//Static block initialization
public class Singleton {
	private static Singleton INSTANCE =new Singleton();
	private Singleton() {
	}
	static{
		try {
			if(INSTANCE==null) {
				INSTANCE=new Singleton();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Singleton getInstance() {
		return INSTANCE;
	}
}