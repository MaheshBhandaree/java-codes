package Deadlock;

public class A 
{
	public synchronized void d1(B b)
	{
		System.out.println("thread1 start execution of method d1");
		try {
			Thread.sleep(10000);
			}
		catch(Exception e) {}
		System.out.println("THread1 calling to B.last() method");
		b.last();
	}
	
	public  synchronized void last()
	{
		System.out.println("Inside A last method");
	}

}
