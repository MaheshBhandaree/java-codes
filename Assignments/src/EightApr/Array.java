package EightApr;
public class Array
{
	static int [] arr = new int[]{1,2,3,4,5};
	static int sum()
	{
		int sum1 = 0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			sum1 += arr[i];
			
			System.out.println(arr[i]);
		}
		return sum1;
	}
	static int avg()
	{
		int sum =0;
		int avg = 0;
		int i ;
		for(i=0;i<arr.length;i++)
		{
			sum +=arr[i];
			avg = sum/arr.length;
		}
		return avg;
	}
	public static void main(String[] args)
	{
		System.out.println("Sum of given Array : "+sum());
		System.out.println("Avarage of given Array : "+avg());
	}
	
	
}