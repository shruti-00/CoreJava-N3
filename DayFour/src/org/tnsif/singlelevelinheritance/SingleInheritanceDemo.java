package org.tnsif.singlelevelinheritance;

public class SingleInheritanceDemo {

	//main class
	public static void main(String[] args) {
		Student s = new Student(); //default constructor
		//System.out.println(s);
		//Parameterized constructor
		Student s1 = new Student("Shruti","789456123478","Pune",789456123L,101,"Shruti Salve");
		System.out.println(s1);

	}
}

/*OUTPUT
 Parent, class
Student [rollno=101, studname=Shruti Salve, get
Rollno()=101, getStudname()=Shruti Salve, getName()=Shruti, getAdharno()=789456123478, getCity()=Pune, getMobno()=789456123]

 */