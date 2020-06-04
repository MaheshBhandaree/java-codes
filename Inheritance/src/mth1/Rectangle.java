package mth1;

import mth.figure;

public class Rectangle extends figure
{

	public Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public double area() 
	{
	
		System.out.println("inside area of rectangle");
		return dim1*dim2;
		
	}

}
