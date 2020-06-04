package Arr;

import java.util.Scanner;

public class ArrayIndex 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of String");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the element in Array");
		for( i=0;i<n;i++) {
		arr[i]= sc.nextInt();
	//System.out.print(arr[i] + " ");
	}
		//System.out.print(arr[i]+"");
		//System.out.println();
	System.out.println("Array is Populated");
	System.out.println("Enter the index Which Element to be Displayed");
	try {
	int idx  = sc.nextInt();
	System.out.println("Element at\t"+idx+"is\t"+arr[idx]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println("User ENTER THE WRONG ARRAY INDEX");
	
	}
	
	
}
}