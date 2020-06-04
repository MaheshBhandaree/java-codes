package apps;

public abstract class Vehicle 
{
	private double km;
	private double ltr;
	
	
	public Vehicle(double km, double ltr) {
		super();
		this.setKm(km);
		this.setLtr(ltr);
	}


	public abstract double calMilage();


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public double getLtr() {
		return ltr;
	}


	public void setLtr(double ltr) {
		this.ltr = ltr;
	}


}
