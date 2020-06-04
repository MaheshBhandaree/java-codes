package menu;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
{
		int fact = 1;
		//int i;
		System.out.println("Enter the no:");
	Scanner sc  = new Scanner(System.in);
	int num = sc.nextInt();
	 long factorial = 1;
     for(int i = 1; i <= num; ++i)
     {
         factorial *= i;
     }
     System.out.printf("Factorial of %d = %d", num, factorial);
 }
}
