package TenApr;

public class BubbleSorter implements Sorter 
{
	

	@Override
		public void sort(int[] arr)
	{ 
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++)
		{  
			for(int j=1; j < (n-i); j++)
			{  
				if(arr[j-1] > arr[j])
				{  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp; 
				}
			}
		}
		
	
		  System.out.println("Sorted array is");
				for( int j=0;j<arr.length;j++)  
				   System.out.println(arr[j]+"");
		}
	}

