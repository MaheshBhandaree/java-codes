package demo;

import java.util.Scanner;
class Node 
{
	int data ;
	Node link;
	
	Node(int data,Node link)
	{
		this.data= data;
		this.link= link;
		
	}

}
public class singleLinkedList
{
	
	static Scanner sc = new Scanner(System.in);
	static Node root= null;
	public static void main(String[] args) 
	{
		int ch;
		while(true)
		{
			
			System.out.println("1.append\n2.display\n3.exit\n");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 :	append();
							break;
				case 2 : 	display();
							break;
				case 3 : 	System.exit(1);
							break;
				default :	System.out.println("Invalid choice");
			}
		}
	}

	private static void display() 
	{
		Node temp;
		temp= root;
		if(temp==null)
		{
			System.out.println("The node is Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println("Element:"+temp.data);
				temp=temp.link;
			}
			
		}
	}

	private static void append()
	{ 	Node temp;
		System.out.println("Eneter the  data");
		int ele = sc.nextInt();
		temp =new Node(ele, null);
		if(root == null)
			{
				//System.out.println("the node is Empty");
				root=temp;
			}
		else
			{
				Node p=root;
				while(p.link!=null)
					{
						p=p.link;
					}
				p.link=temp;
			}
	}
	
}