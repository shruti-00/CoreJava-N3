package org.tnsif.framework;

public abstract class ShopAcc {
	
	//private data members
	private int accno;
	private String accnm;
	private float charges;
	
	//getters and setters
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	//parameterized constructor
	public ShopAcc(int accno, String accnm, float charges) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.charges = charges;
	}
	//toString
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accnm=" + accnm + ", charges=" + charges + "]";
	}
	
	abstract void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	
	

}
