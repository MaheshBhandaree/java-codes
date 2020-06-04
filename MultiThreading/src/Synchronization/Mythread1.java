package Synchronization;

public class Mythread1  extends Thread
{
	Display1 d;
	
	Mythread1(Display1 d)
	{
		this.d = d;
		
	}
	public void run()
	{
		d.displayn();
	}
	
	
	

}
