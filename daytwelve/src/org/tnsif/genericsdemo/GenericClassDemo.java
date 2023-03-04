package org.tnsif.genericsdemo;
//program to demonstrate on a generic class
//generic class
class GenericClass<T>{
	T x;
	void display(T x) {
		this.x=x;
	}
	T accept() {
		return x;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<String> obj1=new GenericClass<String>();
		obj1.display("MET Institute of Engineering");
		System.out.println(obj1.accept());
	}
}

/*OUTPUT
MET Institute of Engineering
*/