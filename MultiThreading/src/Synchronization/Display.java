package Synchronization;

public class Display 
{
	//public	static synchronized void wish(String name)
	public void wish(String name)
	{
		//synchronized(this)//Use Synchroonized bloc in lacks of lines of code for redusing compile time for one object
		synchronized(Display.class)
		{
			;;;;;;;;;;;//lacks lines
			for(int i=0;i<10;i++)
			{
			System.out.println("Good morning :");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){}
			System.out.println(name);
			;;;;;;;//laks lines of code
			}
		}
	}
}
