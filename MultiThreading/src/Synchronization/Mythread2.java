package Synchronization;

public class Mythread2 extends Thread 
{
	Display1 d;
	
	Mythread2(Display1 d)
	{
		this.d = d;
		
	}
	public void run()
	{
		d.displayc();
	}
	

}
