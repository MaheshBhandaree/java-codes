package InterThreadCommunication;

public class ThreadA1 {

	public static void main(String[] args) throws InterruptedException
	{
		ThreadB b = new ThreadB();
		b.start();
		b.sleep(10000);
		synchronized(b)
		{
		//Thread.sleep(0,1);
			System.out.println("main thread calling wait method");
		b.wait(10000);
		System.out.println("main thread get notifiacation call");
		System.out.println(b.total);
		}
	}

}
