package priorities;

public class Join extends Thread {
	public void run()
	{
		for(int i =0 ;i<10;i++)
		{
			System.out.println("Settha Thread");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}

}
