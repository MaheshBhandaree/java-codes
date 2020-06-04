package java_basics;

public class Twodarray 
{

/*	public static void main(String[] args) {
	{
		int [][] arr;
		arr = new int [3][3];
 		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)	
			{
			 	arr[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		System.out.println("Array elements are :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)	
			{
			 	System.out.println(arr[i][j]+"");
			}
			System.out.println(" ");
		}
	
	 /*   int[][] arr= {{1,2,3},{1,2,3}};
	for(int i=0;i<arr.length;++i)
	{
		for(int j=0;j<arr.length;++j)
		{
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	        
		}
}*/
	// static void main(String[] args) 
	   /* { 
	  
	        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
	  
	        for (int i = 0; i < 2; i++) { 
	            for (int j = 0; j < 2; j++) { 
	                System.out.print(arr[i][j] + " "); 
	            } 
	  
	            System.out.println(); 
	        } 
	    } 
	} */

	public static void main(String[] args) {
		System.out.println("**************2dat array**************");
		int arr[][]= new int [4][5];
		int i,j,k=0;
		for(i=0;i<4;i++) 
			for(j=0;j<5;j++)
			{
				arr[i][j]=k;
				k++;
			}
		
		for(i=0;i<4;i++)
		
			for(j=0;j<5;j++) {
			 
				System.out.print(arr[i][j]+" " );
				System.out.println();
			
			}
		
	}}
