package org.tnsif.assignmentFunctionRecursion;

public class HomeWork {
	public int countDig(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count = count + 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {465,3};
		int size = arr.length;
		
		HomeWork hw = new HomeWork();
		for(int i = 0; i<size; i++)
		{
			int count = hw.countDig(arr[i]);
			System.out.println("The length of the number :" +arr[i]+ " is " +count);
		}
	}
}

/*OUTPUT
The length of the number :465 is 3
The length of the number :3 is 1
*/
