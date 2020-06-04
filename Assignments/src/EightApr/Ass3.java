package EightApr;

public class Ass3 
{
	private int  Empid;
	private String Ename;
	private int Salary;
	public Ass3()
	{
		super();
	}
	public Ass3(int empid, String ename, int salary) 
	{
		super();
		Empid = empid;
		Ename = ename;
		Salary = salary;
	}
	public Ass3(Ass3 a)
	{
		Empid = a.Empid;
		Ename = a.Ename;
		Salary = a.Salary;
	}
	@Override
	public String toString() {
		return "Ass3 [Empid=" + Empid + ", Ename=" + Ename + ", Salary=" + Salary + "]";
	}

	
	
	

}
