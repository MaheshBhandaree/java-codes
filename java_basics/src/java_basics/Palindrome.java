package java_basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		int num=0,temp,res,i=0;
		System.out.println("Enter the no:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(num>0)
			{
				res=num%10;
				i = i*10+res;
				num = num/10;
				System.out.println(i);
			}
			if(temp==i)
				System.out.println("The no is Palindrome ");
			else
				System.out.println("the no is not  Palindrome");
	}
			
	
}

