package TreeSet;

import java.util.Comparator;

public class Employee implements Comparator
{
	String name;
	int id;

	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	public int compareTo( Object obj) 
	{
		int id1 = this.id;
		Employee e = (Employee)obj;
		int id2 = e.id;
		if(id1>id2)
			return +1;
		else if(id1<id2)
			return -1;
		else
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
