package java_basics;

import java.util.Scanner;

public class Amstrrong 
{

	public static void main(String[] args) 
	{   int num,temp=0,sum=0,mod;
		System.out.println("Enter the no: ");
		Scanner sc =  new Scanner(System.in);
		num= sc.nextInt();
		temp=num;
		while(num>0)
			{
			mod=num%10;
			num=num/10;
			sum=sum+(mod*mod*mod);
			}
		if(sum==temp)
		{
			System.out.println("the No is  Amstrong");
		}
		else
			System.out.println("the no is not amstrong");
		
			

		
		
		
		
		

	}

}
