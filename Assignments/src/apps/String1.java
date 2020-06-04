package apps;

import java.util.Scanner;

public class String1 implements StringOperation
{	

	

	@Override
	public void reverse(String s)
	{
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reversed String :"+reverse);
	}

	@Override
	public void toUppercase(String s) 
	{
		String res="";
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				ch=(char)(s.charAt(i)-32);
			}
			else
			{
				ch=(char)(s.charAt(i));
			}
			res=res+ch;
			
		}
		System.out.println("String Coverted to Uppercase :"+res);
	}

@Override
	public int length() 
	{
		String s = null;
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		return count;	
		}
		
	}
	

