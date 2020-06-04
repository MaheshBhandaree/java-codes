package overloading;

public class Book 
{
	private int bookid;
	private String bookname;
	private double price;
	public Book(int bookid, String bookname, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bookid :"+bookid+"\nBookname :"+bookname+"\nprice"+price;
	}
	public double calcost()
	{
		return price;
		
	}
	
	
	


}
