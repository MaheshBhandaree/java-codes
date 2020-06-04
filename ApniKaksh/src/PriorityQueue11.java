import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue11 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter no of test cases:");
		int t = sc.nextInt();
		while(t-- !=0) 
		{
			System.out.println("Enter no element in array:");
			int n = sc.nextInt();
			System.out.println("ENter the element you want to peek:");
			int k = sc.nextInt();
			System.out.println("Enter array Element:");
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i = 0;i<n;i++){
				if(i<k)
				{
					pq.add(arr[i]);
				}
				else
				{
					if(pq.peek()<arr[i])
					{
						pq.poll();
						pq.add(arr[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans,Collections.reverseOrder());
			for(int x : ans)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			
		
		}
	}

}
