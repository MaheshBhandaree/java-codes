package EightApr;

import java.util.Scanner;

public class Ass1Demo {

	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		System.out.println("enter name:");
		String s = S.next();
		System.out.println("enter age:");
		int a = S.nextInt();
		System.out.println("Enter rollno:");
		int b = S.nextInt();
		Ass1 d = new Ass1(s, a, b);
		d.display();

	}

}
