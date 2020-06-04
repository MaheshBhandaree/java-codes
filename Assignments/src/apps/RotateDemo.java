package apps;

import java.util.Scanner;

public class RotateDemo{
public static void main(String[] args) {
    int n, position;
    boolean direction;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
        a[i] = s.nextInt();
    }
    System.out.println("Enter the number of position to be rotated:");
    position=s.nextInt();
    System.out.println("Enter the direction of rotation:\nEnter R for Right or L for Left");
	String c=s.next();
	if(c=="R"||c=="r")
	{
		direction=true;
		Rotate1 r1=new Rotate1(a, position, direction);
		r1.display();
	}
	else
	{
		direction=false;
		Rotate1 r1=new Rotate1(a, position, direction);
		r1.display();
	}
	

}
}