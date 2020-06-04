package b1;

import b2.Bike;
import b2.Bycicle;

public class Vehicledemo 
{
	
	public static void main(String[] args) 
	{
	   Bycicle b = new Bycicle ();
	   b.applyBreaks(1);
	   b.changegear(2);
	   b.speedUp(3);
	   System.out.println("bicycle Present stat:");
	   b.PrintStat();
	   Bike b1 = new Bike();
	   b1.applyBreaks(2);
	   b1.changegear(3);
	   b1.speedUp(4);
	   System.out.println("Bike present Stat:");
	   b1.printstat();
	   }

}
