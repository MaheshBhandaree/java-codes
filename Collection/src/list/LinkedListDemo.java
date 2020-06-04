package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("mahesh");
		l.add(30);
		l.add(null);
		l.add("mahesh");
		System.out.println(l);
		l.set(0, "bhandaree");
		l.add(0,"ramesh");
		System.out.println(l);
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
		
	}

}
