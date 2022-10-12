package code;

public class TestRunnable {
	public static void main(String[] args) {
		// New
		
		
		Thread t1 = new Thread(new MultiThreadRunnable(), "FirstThread");
		Thread t2 = new Thread(new MultiThreadRunnable(), "SecondThread");
		  
		  // Runnable
		  t1.start();//Makes thread Runnable. Object is put in thread pool.
		  t2.start();
		 
		 
		 
		
		
		
		/*
		 * Thread t1 = new MultiThread("First Thread"); Thread t2 = new
		 * MultiThread("Second Thread"); Thread t3 = new MultiThread("AnotherThread");
		 * 
		 * t1.setPriority(Thread.MAX_PRIORITY); t2.setPriority(6); t2.start();
		 * t1.start(); t3.start();
		 */
		 
				
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("In " + Thread.currentThread().getName() +" "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
In First Thread 1
In Second Thread 1
In Main Thread 1


*/