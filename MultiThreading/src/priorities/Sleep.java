package priorities;

public class Sleep extends Thread
{
	public void run()
	{
			try {
				for(int i = 0;i<10;i++)
				{
				System.out.println("i am lazy thread");
				Thread.sleep(2000);
				}
			}
			catch(Exception e) 
			{
				System.out.println("i got interppted");
			}
	}
		
}


