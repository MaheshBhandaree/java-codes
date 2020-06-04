package TwelveApr;

import java.util.Scanner;

public class UserId {

	public static void main(String[] args)
	{
		System.out.println("Enter The UserID :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//char ch = str.charAt(i);
		for(int i=0;i<str.length();i++)
			
		if((str.length() >=7) && (str.length()<= 12))
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				System.out.println("user id Is valid");
				break;
		}
		else
			throw new ArithmeticException("User ID is Not valid") ;
		
		
	}

}
