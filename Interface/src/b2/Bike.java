package b2;

import b1.Vehicle;

public class Bike implements Vehicle
{
	 int Speed;	
	 int gear;
	@Override
	public void changegear(int newgear) 
	{
		this.gear = newgear;
	}

	@Override
	public void speedUp(int increment)
	{
	 this.Speed = Speed+increment;
	}

	@Override
	public void applyBreaks(int Decrement)
	{
		this.Speed = Speed - Decrement;
		
	}
	public void printstat()
	{
		System.out.println("Speed :" +Speed+"\nGear:"+gear);
	}
	
}
