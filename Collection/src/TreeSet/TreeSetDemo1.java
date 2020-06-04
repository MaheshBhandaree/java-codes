package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1
{

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator3());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		//t.add(new StringBuffer("C"));
	//	t.add(new StringBuffer("D"));
		System.out.println(t);
	
}

	
}
