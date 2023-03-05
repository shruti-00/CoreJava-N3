package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class client {

	public static void main(String[] args) {
		BankFactory f=new MMBankFactory();
		MMCurrentAcc c=new MMCurrentAcc(1001,"Salve Shruti",3000.0f,1000);
		MMSavingAcc s=new MMSavingAcc(1234,"Shruti Salve",1500.0f,true);
		
		System.out.println("Current Account");
        System.out.println(c);
        c.withdraw(c.getAccBal());
        
        System.out.println("Saving Account");
        System.out.println(s);
        s.withdraw(s.getAccBal());
	}

}
