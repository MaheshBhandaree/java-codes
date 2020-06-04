package java_basics;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args)
	{	int num = 0,i, res=0;
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		/*for(i=1;i<=num;i++)
		{
			
		       res=num/i;
		       System.out.println(res);
			
		
		/*if(num%2==0)
			System.out.println("number is Even");
		else
			System.out.println("Number is  odd");*/
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
				System.out.println("no is  not  prime");
			else
				System.out.println("no is prime");
			break;
				
		}
		
				

	}
}


