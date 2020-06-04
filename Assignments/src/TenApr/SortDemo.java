package TenApr;

import java.util.Scanner;

public class SortDemo
{
	public static void main(String[] args) 
	{	int i;
		System.out.println("Enter the NO of Elements you want in arr");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter The Element in Array");
			for( i=0;i<n;i++)
				arr[i]= sc.nextInt();
			for(int j=0;j<arr.length;j++)
				System.out.println(arr[j]);
			System.out.println("Enter the Charcter for sorting:\nB & b :BuubleSort\nI & i :Insertion sort\nS & s :Selection sort");
			char ch = sc.next().charAt(0);
			if(ch =='b' || ch =='B')
			{
				BubbleSorter  t = new BubbleSorter();
				t.sort(arr);
			}
			else if( ch =='I' || ch =='i')
				{
				InsretionSorter o = new InsretionSorter();
				o.sort(arr);
				o.printArray(arr);
				}
			else if(ch =='S' ||   ch =='s')
			{
				SelectionSorter ds = new SelectionSorter();
				ds.sort(arr);
				ds.printArray(arr);
			}
			else
				System.out.println("Enter sort is not valid");
		
	}

}
