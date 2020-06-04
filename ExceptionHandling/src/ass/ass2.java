package ass;

public class ass2
{ public static void main(String[] args) 
	{	try {
		int arr[] = new int [] {1,2,3,4,5};
		System.out.println(arr[10]);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("The index is bigger");
	}
	finally
	{
		System.out.println("We have to put Smaller length");
	}

	}


}
