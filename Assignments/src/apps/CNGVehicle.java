package apps;

public class CNGVehicle extends Vehicle {

	public CNGVehicle(double km, double ltr) {
		super(km, ltr);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "CNGVehicle [calMilage()=" + calMilage() + "]";
	}


	@Override
	public double calMilage() 
	{
		
		return (getKm()/getLtr())+10;
	}

}
