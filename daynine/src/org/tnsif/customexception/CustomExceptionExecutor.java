package org.tnsif.customexception;
//program to demonstrate on custom exception
//driver class
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id and password :");
		String id = sc.nextLine();
		String password =sc.nextLine();
		
		
		
		try {
			if(id.equals("shrutisalve@gmail.com")&& password.equals("abc@123"))
			{
				System.out.println("Credentials matched");
			}			
			else
				throw new LoginCredential("Invalid Credential ");
		}
		catch(LoginCredential e)
		{
			System.out.println("Exception handled :" +e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}

/*OUTPUT
shrutisalve@gmail.com
abc@123
Credentials matched
Finally Block
*/
