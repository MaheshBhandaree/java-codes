package mth;

public class MyThread1Demo {

	public static void main(String[] args) 
	{
		//System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		t.start();
		System.out.println("main method Executed :"+Thread.currentThread().getName());
		/*System.out.println(t.getName());
		Thread.currentThread().setName("vijay sethupathi");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(10/0);*/
		
		
		
	
	}

}
