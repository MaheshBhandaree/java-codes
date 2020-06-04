package apps;

import java.util.Scanner;

public class VehicleDemo 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter The km and ltr use by Vehicle");
		int k = s.nextInt();
		int l = s.nextInt();
		//System.out.println("The Milage of FuelVehicle:");
		Vehicle v = new FuelVehicle(k, l);
		System.out.println(v);
		//System.out.println("The Milage of ElectricVehicle:");
		Vehicle E = new ElectricVehicle(k,l);
		System.out.println(E);
		//System.out.println("The Milage of FuelVehicle:");
		Vehicle C =  new CNGVehicle(k, l);
		System.out.println(C);
		}
	
	
	

}
