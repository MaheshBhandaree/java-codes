package Haccker;

import java.util.Scanner;

public class ass3 
{
	public static void main(String[] args)
	{
		int [] arr= new int [5];
		Scanner sc  = new  Scanner(System.in);
		System.out.println("Enter the element in Array");
		for(int i=0;i<5;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++ ) {
			boolean isPrime = true;
				for(int j=2;j<i;j++){
					if(i %j == 0){
						isPrime= false;
						break;
					}
				}
				if(isPrime)
					System.out.println( i +"the prime  no in array");
			}
	}
		
}


