package org.tnsif.application;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		GSPrimeAcc p = new GSPrimeAcc(accno, accnm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accno, String accnm, float charges, float deliveryCharges) {
		GSNormalAcc n = new GSNormalAcc(accno, accnm, charges, deliveryCharges);
		return n;
	}

	@Override
	public String toString() {
		return "GSShopFactory [toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
