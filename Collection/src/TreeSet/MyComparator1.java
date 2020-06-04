package TreeSet;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		//return s1.compareTo(s2);//Ascending order
		//return s2.compareTo(s1);//desecndin order
	//	return -s1.compareTo(s2);//descending oreder
		//return -s2.compareTo(s1);//asecnding order
		//return +1;//by insertion order
	//	return -1;//revrese the insertion oredr
		return 0;// only first entry
	}

}
