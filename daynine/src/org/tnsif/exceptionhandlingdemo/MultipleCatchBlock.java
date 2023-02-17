package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on multiple catch block
public class MultipleCatchBlock {

	public static void main(String[] args) {
		//int[] arr = new int[] {1,2,3};

		try 
		{
			int[] arr = new int[] {1,2,3};
			print(arr[1]);
			System.out.println(arr[3]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesnt have third element");
		}		
		//System.out.println("Third line");

		catch(Exception e1){
			System.out.println("Exception handled :"+e1);
			//System.exit(0);
		}
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		
	}
}
