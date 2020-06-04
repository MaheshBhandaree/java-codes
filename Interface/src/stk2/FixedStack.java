package stk2;

import stk1.Intstack;

public class FixedStack implements Intstack {
	private int stck[];
	private int tos;
	
	public FixedStack (int size)
	{
		stck = new int[size];
		tos = -1;
	}

	@Override
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("stsck is Full");
		else
			stck[++tos] = item;
	}

	@Override
	public int pop() 
	{
		if(tos<0)
		{
		System.out.println("stack is uderflow");		
		return 0;
		}
		else
			return stck[tos--];

	}
}
