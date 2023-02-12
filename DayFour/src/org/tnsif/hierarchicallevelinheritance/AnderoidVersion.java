package org.tnsif.hierarchicallevelinheritance;

//to demonstrate on Hierarchical inheritance
public class AnderoidVersion {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public AnderoidVersion() {
		System.out.println("Parent class-Android version : ");
	}

	public AnderoidVersion(String type) {
		super();
		this.type = type;
	}

	@Override 
	public String toString() {
		return "AnderoidVersion [type=" + type + "]";
	}
	
}
