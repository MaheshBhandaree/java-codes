package EightApr;

public class Date
{
	static int cnt;
	 int dd;
	 int mm;
	 int yy;
	
	public Date() 
	{
		
		dd=mm=yy=0;
		cnt++;
	}
	public Date(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		cnt++;
	}
	
	@Override
	public String toString() {
		return "Date"+ dd + "/"+ mm + "/" + yy ;
	}
	public void display()
	{
		System.out.println(cnt);
	}


}
