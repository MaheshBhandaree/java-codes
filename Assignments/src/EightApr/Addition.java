package EightApr;

public  class Addition 
{
	private int x;
	private int y;
	private float a;
	private float b;
	private double q;
	private double w;
	
	
	public Addition(int x, int y, float a, float b, double q, double w) {
		super();
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.q = q;
		this.w = w;
	}
	


	@Override
	public String toString() {
		return "Addition [x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + ", q=" + q + ", w=" + w + "]";
	}



	public void add() 
	{
		int u = x + y;
		System.out.println("x + y ="+u);
		float z = a + b;
		System.out.println("a + b ="+z);
		double r = q + w;
		System.out.println("q + w ="+r);
		
	}
	
	
}
