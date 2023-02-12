package org.tnsif.multilevelinheritance;

//child class2
public class Iphone extends Android {

	private String slottype;
	public void slot()
	{
		System.out.println("Slottype is :"+slottype);
	}
	
	//getters and setters
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

	//default constructor 
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor 
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}

	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	
	
	
}
