package menu;

import java.util.Scanner;

public class Ass1 
{

	public static void main(String[] args)
	{
		System.out.println(" Enter Two numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		System.out.println("Enter The Option you Want to perform");
		System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.Division");
		int opt = sc.nextInt();
		switch(opt) {
		case 1 :
	    
	    	int addition = num1 +num2;
	    	System.out.println("Additon of two numbers "+addition);
	    	break;
	    
		case 2 :
		
			int subtraction = num1- num2;
			System.out.println("subtacrion of two numbers" +subtraction);
			break;
		
		case 3 :
		
			int multiplication = num1 *num2;
			System.out.println("subtacrion of two numbers" +multiplication);
			break;
		
		case 4 :
		
			int division = num1 /num2;
			System.out.println("subtacrion of two numbers" +division);
			break;
		
		case 5 :
			break;
		default :
			System.out.println("enter choice is wrong choice"); 
	}
	}		
}
	
	
		
	
		

	


