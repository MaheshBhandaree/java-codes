package TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator 
{

	@Override
	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		/*if(I1<I2)
		return +1;
		else if(I1>I2)
			return -1;
		els 
		return 0;*/
		//return I1 .compareTo(I2);//Output will get in Ascending order..
		//return -I1 .compareTo(I2);//Output will get in Descendin order..(by using The -ve sign so output get reversd
		//return I2.compareTo(I1);//Decending order
		//return -I2.compareTo(I1);//Ascending
		//return +1;//insertion order.
		return -1;//reverse of insertion order
		//return 0;
	}
	

}
