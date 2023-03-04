package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliveryCharges=0.0f;

	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges);
		this.isPrime=isPrime;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Acc no"+this.getAccno()+" "+"Acc name: "+this.getAccnm()+" "
				+"DeliveryCharges:"+this.getCharges()); 
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	

}
