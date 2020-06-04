package Set;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
	public static void main(String[] args) 
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("d");
		h.add("z");
		System.out.println(h);
		h.add(null);
		h.add(10);
		System.out.println(h.add("z"));
		System.out.println(h);
	}
}


