package java_basics;

public class Revesearray 
{
	public static void reverse(int a[],int n)
	{
		int [] arr = new int[n];
		int j = n;
		for(int i= 0;i<n;i++)
		{
			arr[j-1]=a[i];
			j=j-1;
		}
		System.out.println("reverse array");
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		reverse(arr,arr.length);
	}
}
	
	
	

	/*public static void main(String[] args)
	{ 
		int j = 4;
		int [] arr = new int[10];
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 3;
		arr[4]= 4;
		for(int i =0;i<arr.length;i++)
			{
			
				for(int j=4;j<arr.length-1;j++)
					{
						arr[j]=arr[i];
						System.out.println(arr[j]);
					}
				System.out.println(arr[j]);
			}
	

	}}*/



