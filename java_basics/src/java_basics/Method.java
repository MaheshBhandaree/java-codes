package java_basics;

import java.util.Scanner;

public class Method 
{
	/*static int mymethod(int x,int y)
	{
		return x+y;
		
	}
public static void main(String[] args) {
	
	
	int z =mymethod(5, 10);
	System.out.println(z);
	
}*/

	public static int ageforelection(int age)
	{
		return age;
	}
	public static void main(String[] args) 
	{	//System.out.println("enter the age");
		//Scanner sc = new Scanner (System.in);
		//int a = sc.nextInt();
		int a =ageforelection(18);
		System.out.println("Enter your valid age :");
		Scanner sc = new  Scanner(System.in);
		int age = sc.nextInt();
		if (age>a)
		{
			System.out.println("the Candidate is for election!!" );
		}
		else
		{
			System.out.println("the candidate is not valid");
		}
	
		
	}
}
