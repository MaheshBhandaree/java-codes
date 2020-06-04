package priorities;

public class YieldDemo {

	public static void main(String[] args) 
	{
		Yield y = new Yield();
		y.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
