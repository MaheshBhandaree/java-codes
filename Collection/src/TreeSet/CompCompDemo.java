package TreeSet;//Comparable Comparator

import java.util.TreeSet;

public class CompCompDemo
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("mahesh",100);
		Employee e2 = new Employee("raj",50);
		Employee e3 = new Employee("ramesh",150);
		Employee e4 = new Employee("shail",1000);
		Employee e5 = new Employee("mahesh",100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		
	}
}
