package org.tnsif.singlelevelinheritance;

//child class
public class Student extends Citizen{
	
	//data members
	private int rollno;
	private String studname;
	
	//getters and setters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	//default constructor 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Student(String name, String adharno, String city, long mobno, int rollno, String studname) {
		super(name, adharno, city, mobno);
		this.rollno = rollno;
		this.studname = studname;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getCity()=" + getCity() + ", getMobno()=" + getMobno() + "]";
	}

}
