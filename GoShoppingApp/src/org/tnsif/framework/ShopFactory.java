package org.tnsif.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accno, String accnm, float charges, float deliveryCharges);
}
