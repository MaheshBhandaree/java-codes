package java_basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the 2 "
				+ "no:");
		Scanner sc = new Scanner(System.in);
		double no1 = sc.nextInt();
		double no2 = sc.nextInt();
		System.out.println("enter cases what you want");
		System.out.println("a :addition,m :multiplication,d :division,s:subtraction");
		String str = sc.next();
		switch(str) {
		case "a" :
			System.out.println(no1+no2);
		break;
		case "s":
		System.out.println(no1-no2);
		break;
		case "m":
			System.out.println(no1*no2);
			break;
		case "d":
		System.out.println(no1/no2);
		break;
		case "e":
			System.out.println("thank u");
			break;
		

	}

}}
