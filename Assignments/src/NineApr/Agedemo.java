package NineApr;

import java.util.Scanner;

public class Agedemo {

	public static void main(String[] args) 
	{
		System.out.println("Enter The BirthYear :");
		Scanner sc = new Scanner(System.in);
		int Birthyear = sc.nextInt();
		int currentyear = 2020;
		int age =( currentyear-Birthyear);
		System.out.println("Your age is :"+age);
		CheackAge d  = new CheackAge();
		d.Checkage(age);

	}

}
