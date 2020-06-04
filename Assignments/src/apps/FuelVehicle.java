package apps;

public class FuelVehicle extends Vehicle {

	public FuelVehicle(double km, double ltr) {
		super(km, ltr);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public String toString() {
		return "FuelVehicle [calMilage()=" + calMilage() + "]";
	}




	@Override
	public double calMilage() {
		// TODO Auto-generated method stub
		return getKm()/getLtr();
	}

}
