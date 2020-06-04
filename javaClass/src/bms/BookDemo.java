package bms;

import java.util.Scanner;

import javaClass.PrintBook;
import javaClass.ebook;
import overloading.Book;

public class BookDemo {

	public static void main(String[] args) 
	{
		/*Book b1 = new Book(1001,"bond",500);
		System.out.println(b1);
		Book b2 = new PrintBook(1002,"HarryPorter",500);
		b2.calcost();
		System.out.println(b2);
		Book b3 = new ebook(1003,"jhon wick",500);
		b3.calcost();
		System.out.println(b3);
		}*/
		
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter book id :");
		 int id =sc.nextInt();
		 
		 System.out.println("Enter the Book Name:");
		 String name = sc.next();
		 
		 System.out.println("enter book  price:");
		 double price = sc.nextDouble();
		 
		 System.out.println("Enter Character P or p && E OR e ");
		 String str= sc.next();
		 if(str =="p" && str == "P")
		 {
			 Book b1 = new PrintBook(id,name,price);
			 System.out.println(b1.calcost());
		 }
		 if(str =="e" && str == "E")
		 {
			 Book  b2 = new  ebook(id, name, price);
			 System.out.println(b2);
		 }
		 
		

}}
