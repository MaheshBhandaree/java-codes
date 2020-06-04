package apps;

public class ElectricVehicle extends Vehicle {

	public ElectricVehicle(double km, double ltr) {
		super(km, ltr);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "ElectricVehicle [calMilage()=" + calMilage() + "]";
	}


	@Override
	public double calMilage() {
		// TODO Auto-generated method stub
		return getKm()/getLtr()+15;
	}

}
