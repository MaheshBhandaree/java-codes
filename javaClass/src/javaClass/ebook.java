package javaClass;

import overloading.Book;

public class ebook extends Book
{
	private double calcost;
	private double discount;
	
	public ebook(int bookid, String bookname, double price) {
		super(bookid, bookname, price);
	}
	public double calcost()
	{
		double price = super.calcost();
	
		if(price<500)
		{
			discount = price*2/100;
			calcost = price-discount;
		}
		if(price>500 && price<1000)
		{
			discount  = price*4/100;
			calcost = price-discount;
		}
		if(price>1000)
		{
			discount = price*7/100;
			calcost = price-discount;
		}
		return calcost;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+calcost;
	}
	
	
}
