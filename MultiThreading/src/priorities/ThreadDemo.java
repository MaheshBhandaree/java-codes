package priorities;

public class ThreadDemo {

	public static void main(String[] args)
	{
		
	/*System.out.println(Thread.currentThread().getPriority());
				Thread.currentThread().setPriority(7);
				System.out.println(Thread.currentThread().getPriority());
				Mythread t =  new Mythread();
				System.out.println(Thread.currentThread().getPriority());*/
			Mythread t = new Mythread();
			t.setPriority(10);//here  we have setting priorities for Child class
			t.start();
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread");
			}
	}
}