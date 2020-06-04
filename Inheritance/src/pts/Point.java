package pts;

public class Point
{
	private int x;
	private int y;
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void display()
	{
		System.out.println("["+x+","+y+"]");
	}
	

}
