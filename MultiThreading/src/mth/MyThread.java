package mth;

public class MyThread extends Thread
{
	
	public void start()
	{
		super.start();
		System.out.println("start thread");
	}
	public void run()
	{
		/*for(int i= 0;i<10;i++)
		{
			System.out.println("child thread");
		}*/
		System.out.println("no args");
	}
	public void run(int i)
	{
		System.out.println("1 Args run method");
	}

	
}
