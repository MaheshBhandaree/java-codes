package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new  MyComparator1());
		t.add("Roja");
		t.add("Shobharani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramuluamma");
		System.out.println(t);

	}

}
