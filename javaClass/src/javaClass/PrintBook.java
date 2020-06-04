package javaClass;

import overloading.Book;
public class PrintBook extends Book
{ 
	private double shippingcharge;
	private double totalcost;
	
	public PrintBook(int bookid, String bookname, double price) {
		super(bookid, bookname, price);
	}
	public double calcost()
	{
		double price= super.calcost();
		if(price<500)
		{
			shippingcharge = price*2/100;
			totalcost = price+shippingcharge;
		}
		if(price>500 && price<=1000)
		{
			shippingcharge = price*5/100;
		totalcost = price+shippingcharge;
		}
		if(price>1000)
		{
			shippingcharge = price*7/100;
		totalcost = price+shippingcharge;
		}
		return totalcost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+totalcost;
	}
		
}

