package Deadlock;

public class B 
{
	public synchronized void d2(A a)
	{
		System.out.println("thread1 start execution of method d2");
		try {
			Thread.sleep(10000);
			}
		catch(Exception e) {}
		System.out.println("THread1 calling to a.last() method");
		a.last();
	}

	public synchronized void last() 
	
	{
		System.out.println("inside B last method");
		
	}

}
