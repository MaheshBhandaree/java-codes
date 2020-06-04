package javaClass;

public class Constructor
{
	int id;
	String name;
	double Salary;
	
	public Constructor() 
	{
	}
	
	
 

	public Constructor(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = i;
	}

	public void display()
	{
		System.out.println("id :"+id+"\nname :"+name+"\nsalary :"+Salary);
	}
public static void main(String[] args) 
{
	Constructor c = new Constructor(12,"mahesh",123445);
	//c.toString();
	c.display();
	

	}

}
