package Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("mahesh");
		l.add("satyam");
		l.add("rajesh");
		l.add("sham");
		l.add("raju");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.equals("mahesh"))
			{
				ltr.remove();
			}
			else if(s.equals("satyam"))
			{
				ltr.add("satya");
			}
			else if(s.equals("sham"))
			{
				ltr.set("shamprasad");
			}

			}
		System.out.println(l);
	}

}
