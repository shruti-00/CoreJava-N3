package org.tnsif.hierarchicallevelinheritance;

public class Tiramisu extends AnderoidVersion{
	//data member
	private int version;

	//getter setter
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	//constructors
	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}





}