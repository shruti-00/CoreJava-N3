package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
   final  private float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		
	}
	public void withdraw(float accBal)
	{
	System.out.println("Acc No :"+this.getAccNo()+" "+"Acc Name :"+this.getAccNm()+" "+"Acc Balance :"+this.getAccBal()+"Minimum BaLanace :"+(this.getAccBal()+this.creditLimit));
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

}
