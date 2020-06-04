package apps;

import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
{		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		 String str =sc.next();
		 StringOperation o = new String1();
		o.reverse(str);
		StringOperation o1 = new String1();
		o1.toUppercase(str);
		StringOperation o2 = new String1();
		o2.length();
		
		
		
		
		
		
	
		
		
		
	
}

}
