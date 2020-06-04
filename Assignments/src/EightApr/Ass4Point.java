package EightApr;

public class Ass4Point
{
	private int X;
	private int Y;
	public Ass4Point() {
		super();
	}
	public Ass4Point(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	public Ass4Point(Ass4Point s)
	{
		X = s.X;
		Y = s.Y;
	}
	@Override
	public String toString() {
		return " [X=" + X + ", Y=" + Y + "]";
	}
	
}
