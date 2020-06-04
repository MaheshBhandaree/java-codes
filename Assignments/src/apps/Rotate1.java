package apps;

public class Rotate1 
{
 private int [] arr;
	private int position;
private boolean direction;
public Rotate1(int[] arr, int position, boolean direction) {
	super();
	this.arr = arr;
	this.position = position;
	this.direction = direction;
	System.out.println("Current Elements of Array:");
	for (int i = 0; i < arr.length; i++) 
	{     
	
        System.out.print(arr[i] + " ");     
	}
	System.out.println("");
	if(direction)
	{
		System.out.println("Array after right rotation by "+position+" position"); 
        for(int i = 0; i < position; i++)
        {    
            int j, last; 
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--)
            {               
                arr[j] = arr[j-1];    
            }    
            arr[0] = last;
        }    
	}
	else
	{
		System.out.println("Array after left rotation by "+position+" position"); 
        for(int i = 0; i < position; i++)
        {    
            int j, first;    
            first = arr[0];    
            
            for(j = 0; j < arr.length-1; j++)
            {    
                arr[j] = arr[j+1];    
            }    
            arr[arr.length-1] = first;
        }    
	}
		
}
public void display(){   
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
}

}       

