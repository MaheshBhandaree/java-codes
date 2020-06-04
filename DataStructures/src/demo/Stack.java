package demo;

import java.util.Scanner;

public class Stack
{	static	Scanner sc = new Scanner(System.in);
	static int stack[];
	static int top =-1;
	static int size;
	
	static
	{
		Stack.create();
	}
	public static void main(String[] args) 
	{	
		
		while(true) 
		{
			System.out.println("Enter your choice");
			System.out.println("1.push\n2.pop\n3.peek\n4.traverse\n5.exit");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch) 
			{
				case 1: System.out.println("Enter the element");
						int item= sc.nextInt();
						Stack.push(item);
						break;
				case 2: item=pop();
						if(item==0)
						{
							System.out.println("Stack is Underflow");
						}
						else
						{
							System.out.println("Popped item"+item);
						}
						break;
				case 3: item=peek();
						if(item==0)
							{
								System.out.println("Stack is Underflow");
							}
						else
						{
							System.out.println("Peek item"+item);
						}
						break;
				case 4: travese();
						break;
				case 5: System.exit(1);
				default:System.out.println("Invalid choice\n");
		
			}
		
		}
			
	}
	
	static void create()
	{
		int size;
		System.out.println("Enter the Size of stack");
		size =sc.nextInt();
		stack= new int[size];
		System.out.println("Stack is created with the size"+size);
	}
	public static void push(int item)
	{
		if(Stack.isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{
			top= top+1;
			stack[top]=item;
		}
	}
	public static boolean isFull()
	{
		if(top == size-1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	private static  int pop() {
		if(isEmpty())
		{
			return 0;
		}
		else
		{
		//return stack[top--];
		return stack[top--];
		}
		
	}

	private static boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	private static int peek() {
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top];
		}
		
	}
	private static void travese()
	{
		int i;
		
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		for(i=top; i>=0;i--)
		{
			System.out.println(stack[i]);
		}
		
	}


}
