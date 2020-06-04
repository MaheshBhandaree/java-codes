package java_basics;

public class Pattern 
{
	public static void main(String[] args)
	{int [][]arr = new int [5][1];
		int i,j,k=0;
		arr[0]= new int[1];
		arr[1]= new int[2];
		arr[2]= new int[3];
		arr[3]= new int [4];
		for(i=0;i<5;i++)
			for(j=0;j<i+1;j++) 
			{
				arr[i][j] = k;
				k++;
				
			}
		for(i=0;i<5;i++)
		{
			for(j=0;j<i+1;j++) 
			System.out.print(arr[i][j]+ " ");
				System.out.println();
			}
				
		}
	}
	
