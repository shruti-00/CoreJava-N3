package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {
	public static void main(String[]args)
	{
		ShopFactory f = new GSShopFactory();
		GSPrimeAcc p = new GSPrimeAcc(1234,"Shruti Salve",1050f,true);
		GSNormalAcc n = new GSNormalAcc(1134,"Salve Shruti",1050f,60f);
		
		//prime account
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		//Normal account
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(n.getCharges());	
	}

}

/*OUTPUT
Prime Acc
GSPrimeAcc [toString()=PrimeAcc [isPrime=true]]
Acc no1234 Acc name: Shruti Salve DeliveryCharges:1050.0
Normal Acc
GSNormalAcc [toString()=NormalAcc [deliveryCharges=60.0]]
Acc no1134 Acc name: Salve Shruti DeliveryCharges:1110.0
*/