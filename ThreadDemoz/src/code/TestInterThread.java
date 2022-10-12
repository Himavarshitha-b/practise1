package code;

public class TestInterThread {
	public static void main(String[] args) {
		
		
		/*
		 * Q q = new Q();
		 * 
		 * Producer p = new Producer(q); Consumer c = new Consumer(q);
		 * 
		 * Thread t1 = new Thread(p, "Producer"); Thread t2 = new Thread(c, "Consumer");
		 * 
		 * t1.start(); t2.start();
		 */
		 
		 
		

		
		
		Q1 q1 = new Q1();

		Producer1 p1 = new Producer1(q1);
		Consumer1 c1 = new Consumer1(q1);

		Thread t1 = new Thread(p1, "Producer");
		Thread t2 = new Thread(c1, "Consumer");
		  
		t1.start();
		t2.start();
		 
		
	}
}