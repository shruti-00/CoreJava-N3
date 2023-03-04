package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {

	final private float deliveryCharges;

	public NormalAcc(int accno, String accnm, float charges,float deliveryCharges) {
		super(accno, accnm, charges);
		this.deliveryCharges=deliveryCharges;
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Acc no"+this.getAccno()+" "+"Acc name: "+this.getAccnm()+" "
				+"DeliveryCharges:"+(charges+deliveryCharges));
	}


}
