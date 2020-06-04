package menu;

import java.util.Scanner;

public class PalindromeString 
{
    static boolean isPalindrome(String str) 
    {
        int i = 0, j = str.length() - 1; 
        while(i<j) 
        {
        
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            i++; 
            j--; 
      }   
        return true; 
    } 
	
	public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String");
	String str = s.next();
	if(isPalindrome(str))
			{
				
				System.out.println("Entered String is Palindrome");
				
			}
	else
	{
		System.out.println("Entered String is Not palindrome");
	}
	
	
}

}
