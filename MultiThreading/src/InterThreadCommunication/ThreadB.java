package InterThreadCommunication;

public class ThreadB extends Thread 
{
	int total= 0 ;
	
	public void run()
	{
		synchronized(this)
		{
		System.out.println("Child thread ready for Calculation");
	
		{
		
		for(int i = 1;i<=100;i++)
		{
			total = total+i;
		}
		System.out.println("sending notifiacation to main thread");
		this.notify();
		}
		}
	}
}
