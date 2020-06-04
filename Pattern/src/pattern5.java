import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int n = s.nextInt();
	int number=1;
	for(int i=1;i<=n;i++)
	{
		for (int j=1;j<=n-i;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(number+"  ");
			number = number+1;
		}
		System.out.println();
	}
}
}
		


