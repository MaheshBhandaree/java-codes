import java.util.Scanner;

public class Array 
{public static void main(String[] args) 
{
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of Student: ");
	int n = sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Ente the marks");
	for(int i=0;i<=n-1;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<=n-1;i++)
	{
		 sum += arr[i];
		 
	}
		int average = sum/n;
		System.out.println("AVerage = "+average);
	

	
}

}
