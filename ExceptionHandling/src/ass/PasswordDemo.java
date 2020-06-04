package ass;

import java.util.Scanner;

public class PasswordDemo
{
	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String s1= sc.nextLine();
		 
	
	try {
		if(s1.length()>12)
		{
			throw new PasswordToLongException(null);
		}
		else if(s1.length()<8)
		{
			throw new PassToShortException(null);
		}
		else
		{
			System.out.println("Valid Password");
		}
}
	catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
		
	
}


