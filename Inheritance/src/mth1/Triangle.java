package mth1;

import mth.figure;

public class Triangle extends figure
{

	public Triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public double area()
	{
		System.out.println("Inside are for Triangle");
		return dim1*dim2/2;
	}

}
