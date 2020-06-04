package ElevenApril;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{	int i,j;
		int sum1=0;
		int sum2=0;
		int num=0;
				
		int arr[][] = new int[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The NO of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter The no of Columns");
		int columns = sc.nextInt();
		 num = rows*columns;
		System.out.println("The no OF "+num+" array Elements Enter");
		for( i = 0;i<rows;i++)
		{
			for(  j= 0;j<columns;j++)
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		for( i = 0;i<rows;i++)
		{
			for(  j= 0;j<columns;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("Enter The Element That search in array");
			int no = sc.nextInt();
			for( i = 0;i<rows;i++)
			{
				for(  j= 0;j<columns;j++)
				{
						if(no == arr[i][j])
						System.out.println();
					if(no == arr[i][j])
					{
						System.out.println("row = " + i); 
						System.out.println("column = "+j);
					}
				}
				
			}
			System.out.println("********************************");
			System.out.println("The sum of Diagonal Elements are");
			  for ( i = 0; i < rows; i++) { 
		            for ( j = 0; j < columns; j++) { 
		                if (i == j) 
		                    sum1 += arr[i][j]; 
		               /* if ((i + j) == ((num) - 1)) 
		                    sum2 += arr[i][j]; */
		            } 
		        } 
		      
		        System.out.println(" Sum Of Diagonal Is:"
		                                    + sum1); 
		                                      
		      /*  System.out.println("Secondary Diagonal:"
		                                    +	sum2); */
		    } 
}
		