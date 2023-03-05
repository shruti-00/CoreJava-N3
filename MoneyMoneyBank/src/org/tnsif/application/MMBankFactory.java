package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory  extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
