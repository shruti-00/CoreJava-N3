package org.tnsif.jumping;

public class BreakDemo {

	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
			if(i==4)
			break;
		}

	}
	
}

/*OUTPUT
1 
2 
3 
4 
*/