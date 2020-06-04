package Synchronization;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display1 d = new Display1();
		Mythread1 t1 = new Mythread1(d);
		Mythread2 t2 = new Mythread2(d);
		t1.start();
		t2.start();
		
		
	}

}
