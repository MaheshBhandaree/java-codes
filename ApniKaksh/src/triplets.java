import java.util.Arrays;
import java.util.Scanner;

public class triplets{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases:");
		int t = sc.nextInt();
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("ENter array elements:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
		Triplet g = new Triplet();
			if(g.findTriplet(a,n))
			{
				System.out.println("1");
			}
		else
			{
				System.out.println("0");
			}
	}
		
}
class Triplet
{
	public boolean findTriplet(int arr[],int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		for(int i=0;i<n-2;i++)
		{
			if(twoSum(arr,-arr[i],i+1)) return true;
		}
		return false;
		
	}
	//two sum logic
	

	private boolean twoSum(int[] arr, int x, int i) {
		int j = arr.length-1;
		 while(i<j)
		 {
			if( arr[i]+arr[j] > x)
			{
				j--;
			}
			else if(arr[i]+arr[j]<x)
			{
				i++;
			}
			else
				return true;
		 }
		
		
		return false;
	}
}


