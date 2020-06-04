package java_basics;

import java.util.Scanner;

public class FibonacciNo {

	public static void main(String[] args) 
	{
		int a=0,b=1,num;
		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		for(int i=1;i<num;i++)
		{	
			int sum1=a+b;
			a=b;
			b=sum1;
			System.out.println(sum1);
		}
		
		
		
		

	}

}
