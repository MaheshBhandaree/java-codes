package priorities;

public class Join1Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		Join1.mt = Thread.currentThread();
		Join1 j = new Join1();
		j.start();
	//	j.join();if both thread wait for each othr then no o/p generate this process is called deadlock
		for(int i=0 ;i<10;i++)
		{
			System.out.println("main  Thread");
			Thread.sleep(1000);
		}
				
	}

}