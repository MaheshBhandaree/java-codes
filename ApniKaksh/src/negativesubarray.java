import java.util.Scanner;

public class negativesubarray {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int arr[] = new int [size];
	        for(int i=0;i<size;i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        sc.close();
	        System.out.println(negativeSubarray(arr));
	    }
	    public static int negativeSubarray(int []arr)
	    {
	        int sum=0;
	        int count =  0;

	        for(int i=0;i<4;i++)
	        {
	            for(int j=i;j<4;j++)
	            {
	            	sum += arr[j];
	            	if(sum>0)
	            	{
	            		count++;
	            	}
	            }
	        }
			return count;
	        
	       

	    }


	}
