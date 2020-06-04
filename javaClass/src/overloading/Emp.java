package overloading;

public class Emp
{private int eid;
 private String name;
 private double salary;
 private  double bonus;
public Emp(int eid, String name, double salary, double bonus)
{
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.bonus = bonus;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "eid  :"+eid+"\nname :"+name+"\nsalary :"+salary+"\nbonus:"+bonus;
	
}

public static void main(String[] args) {
	{
		Emp e = new Emp(1001,"mahesh",1200000,505005);
		System.out.println(e);
	}
}


 
 

}
