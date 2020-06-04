package EightApr;

public class Ass4Demo {

	public static void main(String[] args) 
	{
		Ass4Point t = new Ass4Point();
		System.out.println("Default Constructor");
		System.out.println(t);
		Ass4Point t1 = new Ass4Point(21,23);
		System.out.println("Parameteriesed Constructor");
		System.out.println(t1);
		System.out.println("Copy Constructor");
		Ass4Point t2 = new Ass4Point(t1);
		System.out.println(t2);
		

	}

}
