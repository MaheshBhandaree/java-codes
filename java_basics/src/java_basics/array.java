package java_basics;

import java.util.Scanner;

public class array 
{
	public static void main(String[] args) 
	{
		/*String [] arr = new String [5];
		try {
		arr[0]= "mahesh";
		arr[1]="john";
		arr[2]="asd";
		arr[3]="adfa";
		arr[4]= "asad";
		//arr[5]="asd";
		for(int s=0;s<arr.length;s++)
			System.out.println(arr[s]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		String [] arr = new String[2];
		arr[0]= "quiet";
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		if(s1.equals(arr[0]))
		{
			System.out.println("String 1 is Equal to String 2");
			
		}
		else
		{
			System.out.println("Strings are not Equals");
		}
		
		
	
	
}

}
