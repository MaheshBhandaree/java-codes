package priorities;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		Join j =  new Join();
		j.start();
		j.join(1000);
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama Thread");
		}
		
		
	}

}
