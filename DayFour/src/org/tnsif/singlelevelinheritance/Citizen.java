package org.tnsif.singlelevelinheritance;
//To demonstrate on Single level inheritance 

//Parent class
public class Citizen {
	
	//private date members 
	private String name;
	private String adharno;
	private String city;
	private long mobno;
	
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	//default Constructor
	public Citizen() {
		System.out.println("Parent, class");
	}
	
	//Parameterized constructor 
	public Citizen(String name, String adharno, String city, long mobno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mobno=" + mobno + "]";
	}
}
