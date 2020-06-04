package mth;

public class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("run method executed :"+Thread.currentThread().getName());
	}

}