package java_basics;

public class Continue
{
	public static void main(String[] args) 
{
	int i,j;
	for(i=0;i<10;i++)
	{
		for(j=0;j<10;j++) 
		{
			
			if(j>i)
			{
				System.out.println();
			continue;
			}
			System.out.print(""+(i+j));
		}
	System.out.println(); 
	}
	

	}
}
