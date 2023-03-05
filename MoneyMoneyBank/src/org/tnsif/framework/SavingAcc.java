package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc{
    private boolean isSalaried;
    private static final float MINBAL=1000.0f;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Acc No :"+this.getAccNo()+" "+"Acc Name :"+this.getAccNm()+" "+"Acc Balance :"+this.getAccBal()+" "+"Minimum BaLanace :"+this.MINBAL);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	

}
