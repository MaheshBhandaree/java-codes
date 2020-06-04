package java_basics;

import java.util.Scanner;

public class minmax {

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			long  arr[] =new long [5];
			for(int arr_i=0;arr_i<5;arr_i++)
				arr[arr_i]= sc.nextLong();
	
			long minval=0,maxval=0;
			for(int i=0;i<5;i++)
			{
				long minf = sumOfNumbers(i,arr);
				long maxf = sumOfNumbers(i,arr);
				if(i==0)
				{
					minval = minf;
					maxval = maxf;
					
				}
				if (minf<minval) {
					minval=minf;
				}
				if(maxf>minval)
					maxval=maxf;
				
			}
			System.out.println(minval +" "+minval);
		
	
		// TODO Auto-generated method stub

	}

	private static long sumOfNumbers(int i, long[] arr) {
		int k = 0,j = 0;
		return k+j;
	}

}
