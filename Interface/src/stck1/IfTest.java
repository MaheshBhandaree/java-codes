package stck1;

import stk2.FixedStack;

public class IfTest 
{public static void main(String[] args)
{
	FixedStack mystack1 = new FixedStack(5);
	FixedStack mystack2 = new FixedStack(6);
	
	for(int i = 0;i<8;i++)
	{
		mystack1.push(i);
	}
	for(int i = 0;i<10;i++)
	{
		mystack2.push(i);
	}
	System.out.println("stack in Mystack1");

	for(int i = 0;i<5;i++)
		System.out.println(mystack1.pop());
	System.out.println("stack in mystack2");
	for(int i = 0;i<5;i++)
		System.out.println(mystack1.pop());
		

}
}
