package apps;

public class Sortarray 
{
	public static boolean isSorted(int []arr)
	{
		int i;
		boolean flag = true;
		for(i=0 ; i<arr.length-1;i++) 
		{
			if(arr[i]>arr[i+1])
			{ 
				flag = false;
			}
		}
		return flag;
	}
	public static void sortArr(int [] arr) {
		int i, temp;
		for(i=0 ; i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1]) 
			{
				temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1]= temp;
			
				
			}
		}
	}
	 public static void main(String[] args) 
	 {	
		int i;
	  	int arr[]= {12,-87,33,22,43};
	  	System.out.println("Array before  sort ");
	  	for(i=0;i<arr.length;i++)
	  	{
	  	System.out.println(arr[i]+" ");
	  	}
	  	while(isSorted(arr)==false)
	  	{
		 sortArr(arr); 
	  	}
	 	System.out.println("\n\narray after sorting");
	 		for(i=0;i<arr.length;i++)
	 			{
	 				System.out.println(arr[i]+" ");
	 			}
	
	 }

}
