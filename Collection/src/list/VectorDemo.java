package list;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v =  new Vector();
		System.out.println(v.capacity());
		for(int i=1 ; i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer I = (Integer)e.nextElement();
			if(I%2 ==0)
			{
				System.out.println(I);
			}
		}
		System.out.println(v);
		
	/*	System.out.println(v.capacity());
		v.addElement("n");
		System.out.println(v.capacity());
		System.out.println(v);*/
		
		
		
	}}
		