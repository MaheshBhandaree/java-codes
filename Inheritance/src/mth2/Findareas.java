package mth2;

import mth.figure;
import mth1.Rectangle;
import mth1.Triangle;

public class Findareas
{public static void main(String[] args) 
{
	figure f = new figure(12,10);
	Rectangle r = new Rectangle(5,6);
	Triangle t = new Triangle(12, 13);
	System.out.println(r.area());
	System.out.println(t.area());
	System.out.println(f.area());
	
}

}
