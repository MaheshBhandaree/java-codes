package b2;


import b1.Vehicle;

public class Bycicle implements Vehicle 
{	 int Speed;	
	 int gear;


	@Override
	public void changegear(int newGear) 
	{
		this.gear = newGear;
	}

	@Override
	public void speedUp(int increment) 
	{
		this .Speed = Speed + increment;
	}

	@Override
	public void applyBreaks(int Decrement) 
	{
		this.Speed = Speed -Decrement;

	}
	public void PrintStat()
	{
		System.out.println("Speed :"+Speed+"\nGear :"+gear);
	}

}
