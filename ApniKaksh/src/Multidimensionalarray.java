import java.util.Scanner;

public class Multidimensionalarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and column");
		int row = sc.nextInt();
		int columns= sc.nextInt();
		System.out.println("Enter the Elements in Array a:");
		int a[][]= new int [row][columns];
		int b[][]= new int[row][columns];
		int c[][]= new int[row][columns];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter the Elements in Array b:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		System.out.println("additon:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

}
}